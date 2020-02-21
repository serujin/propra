package entregas.poo1.poo1ejercicio3;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Board {
	private Icon xImage;
	private Icon oImage;
	private boolean firstPlayerTurn;
	private int count = 0;
	private static final int SCALE = 40;
	private static final int SIZE = Toolkit.getDefaultToolkit().getScreenSize().width*SCALE/100;
	private static final int BOARD_SPACE_SIZE = SIZE/3;
	private JFrame tableFrame = new JFrame();
	private JPanel boardPanel = new JPanel();
	BoardSpace tL = new BoardSpace();
	BoardSpace tC = new BoardSpace();
	BoardSpace tR = new BoardSpace();
	BoardSpace cL = new BoardSpace();
	BoardSpace cC = new BoardSpace();
	BoardSpace cR = new BoardSpace();
	BoardSpace bL = new BoardSpace();
	BoardSpace bC = new BoardSpace();
	BoardSpace bR = new BoardSpace();
	public BoardSpace[] spaces = {tL,tC,tR,cL,cC,cR,bL,bC,bR};
	BoardSpace[] corners = {tL,tR,bL,bR};
	BoardSpace[] sides = {tC,cR,bC,cL};
	BoardSpace[] winColumn1 = {tL,cL,bL};
	BoardSpace[] winColumn2 = {tC,cC,bC};
	BoardSpace[] winColumn3 = {tR,cR,bR};
	BoardSpace[] winRow1 = {tL,tC,tR};
	BoardSpace[] winRow2 = {cL,cC,cR};
	BoardSpace[] winRow3 = {bL,bC,bR};
	BoardSpace[] winDiagonal1 = {tL,cC,bR};
	BoardSpace[] winDiagonal2 = {bL,cC,tR};
	public Board(int players) {
		firstPlayerTurn = true;
	}
	public void initGraphics() {
		tableFrame.setSize(SIZE,SIZE);
		tableFrame.setLocationRelativeTo(null);
		tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardPanel.setSize(SIZE,SIZE);
		boardPanel.setLayout(new GridLayout(3,3));
		boardPanel.setBackground(new Color(26, 188, 156));
		addBoardSpace();
		tableFrame.add(boardPanel);
		tableFrame.setResizable(false);
		tableFrame.setUndecorated(true);
		tableFrame.setVisible(true);
	}
	public void addBoardSpace() {
		boardPanel.add(tL);
		boardPanel.add(tC);
		boardPanel.add(tR);
		boardPanel.add(cL);
		boardPanel.add(cC);
		boardPanel.add(cR);
		boardPanel.add(bL);
		boardPanel.add(bC);
		boardPanel.add(bR);
	}
	public void initIcons() {
		ImageIcon icon;
		icon = new ImageIcon("src/entregas/poo1/poo1Ejercicio3/x.png");
		xImage = new ImageIcon(icon.getImage().getScaledInstance(BOARD_SPACE_SIZE, BOARD_SPACE_SIZE, Image.SCALE_DEFAULT));
		icon = new ImageIcon("src/entregas/poo1/poo1Ejercicio3/o.png");
		oImage = new ImageIcon(icon.getImage().getScaledInstance(BOARD_SPACE_SIZE, BOARD_SPACE_SIZE, Image.SCALE_DEFAULT));
	}
	public boolean checkXWin() {
		if((tL.xUsed && tC.xUsed && tR.xUsed) || (cL.xUsed && cC.xUsed && cR.xUsed) || (bL.xUsed && bC.xUsed && bR.xUsed)) { //Check rows
			return true;
		}
		if((tL.xUsed && cL.xUsed && bL.xUsed) || (tC.xUsed && cC.xUsed && bC.xUsed) || (tR.xUsed && cR.xUsed && bR.xUsed)) { //Check columns
			return true;
		}
		if((tL.xUsed && cC.xUsed && bR.xUsed) || (tR.xUsed && cC.xUsed && bL.xUsed)) { //Check diagonals
			return true;
		}
		return false;
	}
	public boolean checkOWin() {
		if((tL.oUsed && tC.oUsed && tR.oUsed) || (cL.oUsed && cC.oUsed && cR.oUsed) || (bL.oUsed && bC.oUsed && bR.oUsed)) { //Check rows
			return true;
		}
		if((tL.oUsed && cL.oUsed && bL.oUsed) || (tC.oUsed && cC.oUsed && bC.oUsed) || (tR.oUsed && cR.oUsed && bR.oUsed)) { //Check columns
			return true;
		}
		if((tL.oUsed && cC.oUsed && bR.oUsed) || (tR.oUsed && cC.oUsed && bL.oUsed)) { //Check diagonals
			return true;
		}
		return false;
	}
	class BoardSpace extends JLabel implements MouseListener {
		private static final long serialVersionUID = 1L;
		private boolean activated = false;
		private boolean xUsed;
		private boolean oUsed;
		public BoardSpace() {
			setSize(BOARD_SPACE_SIZE, BOARD_SPACE_SIZE);
			addMouseListener(this);
			setBorder(new LineBorder(new Color(17, 122, 101)));
			xUsed = false;
			oUsed = false;
		}
		public void xTurn() {
			setIcon(xImage);
			firstPlayerTurn = false;
			xUsed = true;
			activated = true;
			if(checkXWin()) {
				count+=9;
				JOptionPane.showMessageDialog(null, "　Ganan las X!!");
				System.exit(0);
			}
			if(count==5) {
				JOptionPane.showMessageDialog(null, "　Empate!!");
				System.exit(0);
			}
			count++;
		}
		public void oTurn() {
			setIcon(oImage);
			firstPlayerTurn = true;
			oUsed = true;
			activated = true;
			if(checkOWin()) {
				count+=9;
				JOptionPane.showMessageDialog(null, "　Ganan las O!!");
				System.exit(0);
			}
			if(count==5) {
				JOptionPane.showMessageDialog(null, "　Empate!!");
				System.exit(0);
			}
			count++;
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			if(firstPlayerTurn && !activated && count<6) {
				xTurn();
			} else if(!firstPlayerTurn && !activated && count<6){
				oTurn();
			}
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {}
		@Override
		public void mouseReleased(MouseEvent arg0) {}
		
	}
}

