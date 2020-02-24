package entregas.poo1.poo1ejercicio3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter{
	@Override 
	public void mouseClicked(MouseEvent e) {
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				if(e.getComponent().equals(Board.positions[i][j])) {
					Board.activatePosition(i,j,Board.playerOne);
				}
			}
		}
	}
}
