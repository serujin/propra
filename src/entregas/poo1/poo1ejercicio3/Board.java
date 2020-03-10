package entregas.poo1.poo1ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Board extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel[][] positions = new JLabel[3][3];
	private String[][] aux = new String[3][3];
	private boolean iaActivated;
	private static final String PLAYER1 = "X";
	private static final String PLAYER2 = "O";
	String currentPlayer;
	int moves = 0;

	/**
	 * Initializes the Board with the selected number of players
	 * 
	 * @param players --> The number of players (1 or 2)
	 */
	public Board(int players) {
		if (players == 1) {
			iaActivated = true;
		} else {
			iaActivated = false;
			currentPlayer = PLAYER1;
		}
		initLabels();
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				add(positions[i][j]);
			}
		}
		if (iaActivated) {
			iaTurn();
		}
	}

	/**
	 * Initializes the matrixes
	 */
	private void initLabels() {
		double scale = 0.15;
		int size = (int) (Toolkit.getDefaultToolkit().getScreenSize().height * scale);
		Mouse mouse = new Mouse();
		Font labelFont = new Font("Verdana", Font.BOLD, size);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				positions[i][j] = new JLabel();
				positions[i][j].setText("");
				positions[i][j].setFont(labelFont);
				positions[i][j].addMouseListener(mouse);
				positions[i][j].setBorder(new LineBorder(Color.black));
				positions[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				aux[i][j] = "";
			}
		}
	}

	/**
	 * This method check if X win the game
	 * 
	 * @return True if X won the game
	 */
	private boolean checkXWin() {
		for (int i = 0; i < 3; i++) {
			if (aux[i][0].equals(PLAYER1) && aux[i][1].equals(PLAYER1) && aux[i][2].equals(PLAYER1)) {
				return true;
			}
			if (aux[0][i].equals(PLAYER1) && aux[1][i].equals(PLAYER1) && aux[2][i].equals(PLAYER1)) {
				return true;
			}
		}
		if (aux[0][0].equals(PLAYER1) && aux[1][1].equals(PLAYER1) && aux[2][2].equals(PLAYER1)) {
			return true;
		}
		return aux[0][2].equals(PLAYER1) && aux[1][1].equals(PLAYER1) && aux[2][0].equals(PLAYER1);
	}

	/**
	 * This method check if O win the game
	 * 
	 * @return True if O won the game
	 */
	private boolean checkOWin() {
		for (int i = 0; i < 3; i++) {
			if (aux[i][0].equals(PLAYER2) && aux[i][1].equals(PLAYER2) && aux[i][2].equals(PLAYER2)) {
				return true;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (aux[0][i].equals(PLAYER2) && aux[1][i].equals(PLAYER2) && aux[2][i].equals(PLAYER2)) {
				return true;
			}
		}
		if (aux[0][0].equals(PLAYER2) && aux[1][1].equals(PLAYER2) && aux[2][2].equals(PLAYER2)) {
			return true;
		}
		return aux[0][2].equals(PLAYER2) && aux[1][1].equals(PLAYER2) && aux[2][0].equals(PLAYER2);
	}

	/**
	 * This method check if there's a tie on the game
	 * 
	 * @return True if there's a tie on the game
	 */
	private boolean checkTie() {
		int activated = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!aux[i][j].equals("")) {
					activated++;
				}
			}
		}
		return activated == 9;
	}
	/**
	 * The recursive algorithm to select the best option to the IA move, 
	 * 		the IA is always playing as X 
	 * 
	 * @param checkingMax --> if its maximizing or not
	 * @return 0 if the result its a tie, 1 if IA wins, -1 if player wins
	 */
	private int minimax(boolean checkingMax) {
		if (checkXWin()) {
			return 1;
		} else if (checkOWin()) {
			return -1;
		} else if (checkTie()) {
			return 0;
		}
		if (checkingMax) {
			return maxTurn();
		} else {
			return minTurn();
		}
	}

	/**
	 * The part of the IA algorithm finding minimum score
	 * 
	 * @return The minimum score
	 */
	private int minTurn() {
		int bestScore = 99999999;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (aux[i][j].equals("")) {
					aux[i][j] = PLAYER2;
					int score = minimax(true);
					aux[i][j] = "";
					if (score < bestScore) {
						bestScore = score;
					}
				}
			}
		}
		return bestScore;
	}
	/**
	 * The part of the IA algorithm finding maximum score
	 * 
	 * @return The maximum score
	 */
	private int maxTurn() {
		int bestScore = -99999999;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (aux[i][j].equals("")) {
					aux[i][j] = PLAYER1;
					int score = minimax(false);
					aux[i][j] = "";
					if (score > bestScore) {
						bestScore = score;
					}
				}
			}
		}
		return bestScore;
	}
	/**
	 * This method does the IA turn, it finds the best score, and then it moves
	 */
	private void iaTurn() {
		int bestI = 0;
		int bestJ = 0;
		int bestScore = -99999999;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (aux[i][j].equals("")) {
					aux[i][j] = PLAYER1;
					int score = minimax(false);
					aux[i][j] = "";
					if (score > bestScore) {
						bestScore = score;
						bestI = i;
						bestJ = j;
					}
				}
			}
		}
		aux[bestI][bestJ] = PLAYER1;
		positions[bestI][bestJ].setText(PLAYER1);
		moves++;
	}
	class Mouse extends MouseAdapter {
		/**
		 * If it's available, this method activates the clicked position on the board 
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (e.getComponent().equals(positions[i][j]) && aux[i][j].equals("")) {
						if (iaActivated) {
							aux[i][j] = PLAYER2;
							positions[i][j].setText(PLAYER2);
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
		/**
		 * This method changes the turn
		 */
		private void changeTurn() {
			if (currentPlayer.equals(PLAYER1)) {
				currentPlayer = PLAYER2;
			} else {
				currentPlayer = PLAYER1;
			}
		}
		/**
		 * This method check if the game is ended
		 */
		private void checkEnd() {
			if (checkXWin()) {
				show("Ganan las X");
			}
			if (checkOWin()) {
				show("Ganan las O");
			}
			if (moves == 9) {
				show("Empate");
			}
		}
		/**
		 * This method shows the result of the game and stops the game
		 * @param winner --> A string for the user to know the result of the game
		 */
		private void show(String winner) {
			JOptionPane.showMessageDialog(null, winner);
			JOptionPane.showMessageDialog(null, "El programa se cerrará");
			System.exit(0);
		}
	}
}
