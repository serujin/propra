package entregas.poo1.poo1ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Board extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final int SIZE = (int) (Toolkit.getDefaultToolkit().getScreenSize().height*0.15);
	public JLabel[][] positions = new JLabel[3][3];
	public String[][] aux = new String[3][3];
	Font labelFont = new Font("Verdana",Font.BOLD, SIZE);
	public boolean iaActivated;
	Mouse mouse = new Mouse();
	String firstPlayer = "X";
	String secondPlayer = "O";
	String ia = "X";
	String currentPlayer = "";
	int bestI;
	int bestJ; 
	int moves = 0;
	public Board(int players) {
		if(players == 1) {
			iaActivated = true;
		} else {
			iaActivated = false;
			currentPlayer = firstPlayer;
		}
		initLabels();
		setLayout(new GridLayout(3,3));
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				add(positions[i][j]);
			}
		}
		if(iaActivated) {
			iaTurn();
		}
	}
	public void initLabels() {
		for(int i = 0; i<3 ; i++) {
			for(int j = 0; j<3; j++) {
				positions[i][j] = new JLabel();
				positions[i][j].setText("");
				positions[i][j].setFont(labelFont);
				positions[i][j].addMouseListener(mouse);
				positions[i][j].setBorder(new LineBorder(Color.black));
				positions[i][j].setHorizontalAlignment(JLabel.CENTER);
				aux[i][j]="";
			}
		}
	}
	public void changeTurn() {
		if(currentPlayer.equals(firstPlayer)) {
			currentPlayer=secondPlayer;
		} else {
			currentPlayer=firstPlayer;
		}
	}
	public boolean checkXWin() {
		for(int i=0; i<3;i++) {
			if(aux[i][0].equals(firstPlayer) && aux[i][1].equals(firstPlayer) && aux[i][2].equals(firstPlayer)) {
				return true;
			} 
			if(aux[0][i].equals(firstPlayer) && aux[1][i].equals(firstPlayer) && aux[2][i].equals(firstPlayer)) {
				return true;
			} 
		}
		if(aux[0][0].equals(firstPlayer) && aux[1][1].equals(firstPlayer) && aux[2][2].equals(firstPlayer)) {
			return true;
		}
		if(aux[0][2].equals(firstPlayer) && aux[1][1].equals(firstPlayer) && aux[2][0].equals(firstPlayer)) {
			return true;
		}
		return false;		
	}
	public boolean checkOWin() {
		for(int i=0; i<3;i++) {
			if(aux[i][0].equals(secondPlayer) && aux[i][1].equals(secondPlayer) && aux[i][2].equals(secondPlayer)) {
				return true;
			} 
		}
		for(int i=0; i<3;i++) {
			if(aux[0][i].equals(secondPlayer) && aux[1][i].equals(secondPlayer) && aux[2][i].equals(secondPlayer)) {
				return true;
			} 
		}
		if(aux[0][0].equals(secondPlayer) && aux[1][1].equals(secondPlayer) && aux[2][2].equals(secondPlayer)) {
			return true;
		}
		if(aux[0][2].equals(secondPlayer) && aux[1][1].equals(secondPlayer) && aux[2][0].equals(secondPlayer)) {
			return true;
		}
		return false;		
	}
	public void show(String winner) {
		JOptionPane.showMessageDialog(null, winner);
		System.exit(0);
	}
	public boolean checkTie() {
		int activated = 0;
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(!aux[i][j].equals("")) {
					activated++;
				}
			}
		}
		if(activated==9) {
			return true;
		}
		return false;
	}
	public int minimax(boolean checkingMax) {
		if(checkXWin()) {
			return 1;
		} else if(checkOWin()) {
			return -1;
		} else if(checkTie()) {
			return 0;
		}
		if(checkingMax) {
			int bestScore = -99999999;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(aux[i][j].equals("")) {
					aux[i][j]=ia;
					int score = minimax(false);
					aux[i][j]="";
					if(score > bestScore) {
						bestScore = score;
					}
				}	
			}
		}
		return bestScore;
		} else {
			int bestScore = 99999999;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(aux[i][j].equals("")) {
					aux[i][j]=secondPlayer;
					int score = minimax(true);
					aux[i][j]="";
					if(score < bestScore) {
						bestScore = score;
					}
				}	
			}
		}
		return bestScore;
		}
	}
	public void checkEnd() {
		if(checkXWin()) {
			show("Ganan las X");
		}
		if(checkOWin()) {
			show("Ganan las O");
		}
		if(moves==9) {
			show("Empate");
		}
	}
	public void iaTurn() {
		int bestScore = -99999999;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(aux[i][j].equals("")) {
					aux[i][j]=firstPlayer;
					int score = minimax(false);
					aux[i][j]="";
					if(score > bestScore) {
						bestScore = score;
						bestI = i;
						bestJ = j;
					}
				}
			}
		}
		aux[bestI][bestJ]=firstPlayer;
		positions[bestI][bestJ].setText(firstPlayer);
		moves++;
		System.out.println(moves);
		checkEnd();
	}

	class Mouse extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (e.getComponent().equals(positions[i][j]) && aux[i][j].equals("")) {
						if (iaActivated) {
							aux[i][j] = secondPlayer;
							positions[i][j].setText(secondPlayer);
							moves++;
							iaTurn();
						} else {
							aux[i][j] = currentPlayer;
							positions[i][j].setText(currentPlayer);
							changeTurn();
							moves++;
						}
					}
				}
			}
			checkEnd();
		}
	}
}

