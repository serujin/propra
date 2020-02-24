package entregas.poo1.poo1ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Board extends JPanel {
	private static final long serialVersionUID = 1L;
	public static final int SIZE = (int) (Toolkit.getDefaultToolkit().getScreenSize().height*0.15);
	public static JLabel[][] positions = new JLabel[3][3];
	Font labelFont = new Font("Verdana",Font.BOLD, SIZE);
	public static boolean playerOne = true;
	public static boolean iaActivated = false;
	public static boolean iaTurnDone = false;
	Mouse mouse = new Mouse();
	static String winner = "";
	static String x = "X";
	static String o = "O";
	static int bestI;
	static int bestJ; 
	public Board(int players) {
		if(players == 1) {
			iaActivated = true;
		}
		initLabels();
		setLayout(new GridLayout(3,3));
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				add(positions[i][j]);
			}
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
			}
		}
	}
	public static void activatePosition(int i, int j, boolean player) {
		if(player && positions[i][j].getText().equals("")) {
			if(iaActivated) {
				iaTurnDone = false;
			}
			positions[i][j].setText(x);
			changeTurn();
			if(checkXWin()) {
				showWin();
			}
			if(!iaTurnDone && iaActivated) {
				iaTurn();
			}
		} else if(!player && positions[i][j].getText().equals("")) {
			positions[i][j].setText(o);
			changeTurn();
			if(checkOWin()) {
				showWin();
			}
		} 
	}
	public static void changeTurn() {
		if(playerOne) {
			playerOne=false;
		} else {
			playerOne=true;
		}
	}
	public static boolean checkXColumnWin() {
		int xNumber=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(positions[i][j].getText().equals(x)) {
					xNumber++;
				}
			}
			if(xNumber==3) {
				winner = "Ganan las X en la columna"+(i+1);
				return true;
			}
			xNumber=0;
		}
		return false;
	}
	public static boolean checkOColumnWin() {
		int oNumber=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(positions[i][j].getText().equals(o)) {
					oNumber++;
				}
			}
			if(oNumber==3) {
				winner = "Ganan las O en la columna"+(i+1);
				return true;
			}
			oNumber=0;
		}
		return false;
	}
	public static boolean checkXRowWin() {
		int xNumber=0;
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				if(positions[i][j].getText().equals(x)) {
					xNumber++;
				}
			}
			if(xNumber==3) {
				winner = "Ganan las X en la fila"+(j+1);
				return true;
			}
			xNumber=0;
		}
		return false;
	}
	public static boolean checkORowWin() {
		int oNumber=0;
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				if(positions[i][j].getText().equals(o)) {
					oNumber++;
				}
			}
			if(oNumber==3) {
				winner = "Ganan las O en la fila"+(j+1);
				return true;
			}
			oNumber=0;
		}
		return false;
	}
	public static boolean checkXDiagonalWin() {
		int xNumber=0;
		int xNumber2=0;
		for(int i=0,j=0,k=2;i<3;i++,j++,k--) {
			if(positions[i][j].getText().equals(x)) {
				xNumber++;
			}
			if(positions[i][k].getText().equals(x)) {
				xNumber2++;
			}
			if(xNumber==3) {
				winner = "Ganan las X en la diagonal 1";
				return true;
			}
			if(xNumber2==3) {
				winner = "Ganan las X en la diagonal 1";
				return true;
			}
		}
		return false;
	}
	public static boolean checkODiagonalWin() {
		int oNumber=0;
		int oNumber2=0;
		for(int i=0,j=0,k=2;i<3;i++,j++,k--) {
			if(positions[i][j].getText().equals(o)) {
				oNumber++;
			}
			if(positions[i][k].getText().equals(o)) {
				oNumber2++;
			}
			if(oNumber==3) {
				winner = "Ganan las O en la diagonal 2";
				return true;
			}
			if(oNumber2==3) {
				winner = "Ganan las O en la diagonal 2";
				return true;
			}
		}
		return false;
	}
	public static boolean checkXWin() {
		if(checkXColumnWin()) {
			return checkXColumnWin();
		} 
		if(checkXRowWin()) {
			return checkXRowWin();
		}
		if(checkXDiagonalWin()) {
			return checkXDiagonalWin();
		}
		return false;		
	}
	public static boolean checkOWin() {
		if(checkOColumnWin()) {
			return checkOColumnWin();
		} 
		if(checkORowWin()) {
			return checkORowWin();
		}
		if(checkODiagonalWin()) {
			return checkODiagonalWin();
		}
		return false;		
	}
	public static void showWin() {
		JOptionPane.showMessageDialog(null, winner);
		System.exit(0);
	}
	public static int minimax(boolean checkingMax) {
		if(checkingMax) {
			int bestScore = -99999;
			int score = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					activatePosition(i,j,!checkingMax);
					if(checkXWin()) {
						bestI = i;
						bestJ = j;
						return 1;
					} else if(checkOWin()) {
						return -1;
					} else {
						score =  minimax(false);
						bestScore = Math.max(bestScore, score);
						positions[i][j].setText("");
					}
				}
			}
			return bestScore;
		} else {
			int bestScore = 99999;
			int score = 0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					activatePosition(i,j,!checkingMax);
					if(checkOWin()) {
						bestI = i;
						bestJ = j;
						return 1;
					} else if(checkXWin()) {
						return -1;
					} else {
						score =  minimax(true);
						bestScore = Math.min(bestScore, score);
					}
				}
			}
			return bestScore;
		}
		
	}
	public static void iaTurn() {
		minimax(false);
		activatePosition(bestI,bestJ,false);
		iaTurnDone = true;
	}
}

