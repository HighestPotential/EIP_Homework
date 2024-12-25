package none;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame {
	private static final long serialVersionUID = 1071904268259534937L;
	private static String turn = "X";
	private static JButton[][] grid =new JButton [3][3];
	
	public TicTacToe() {
		setTitle("TicTacToe");
		this.setLayout(new GridLayout(3, 3));
		setSize(400, 400);
		
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				JButton button=new JButton("");
				
				button.addActionListener(e -> {
					JButton source = (JButton)e.getSource();
					String buttonText = source.getText();
					if(buttonText=="X" || buttonText=="O")
						return;
					
					source.setText(turn);
					
					checkIfWon();
					
					if(turn=="X")
						turn="O";
					else
						turn ="X";
					
				});
				
				grid[i][j]=button;
				this.add(button);
				
			}
		}
		
		
		setVisible(true);
	}
	
	 private void checkIfWon() {
	      
	        for (int i = 0; i < 3; i++) {
	           
	            if (!grid[i][0].getText().isEmpty() &&
	                grid[i][0].getText().equals(grid[i][1].getText()) &&
	                grid[i][0].getText().equals(grid[i][2].getText())) {
	                announceWinner(grid[i][0].getText());
	                return;
	            }
	           
	            if (!grid[0][i].getText().isEmpty() &&
	                grid[0][i].getText().equals(grid[1][i].getText()) &&
	                grid[0][i].getText().equals(grid[2][i].getText())) {
	                announceWinner(grid[0][i].getText());
	                return;
	            }
	        }

	       
	        if (!grid[0][0].getText().isEmpty() &&
	            grid[0][0].getText().equals(grid[1][1].getText()) &&
	            grid[0][0].getText().equals(grid[2][2].getText())) {
	            announceWinner(grid[0][0].getText());
	            return;
	        }
	        if (!grid[0][2].getText().isEmpty() &&
	            grid[0][2].getText().equals(grid[1][1].getText()) &&
	            grid[0][2].getText().equals(grid[2][0].getText())) {
	            announceWinner(grid[0][2].getText());
	            return;
	        }

	     
	        boolean allFilled = true;
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                if (grid[row][col].getText().isEmpty()) {
	                    allFilled = false;
	                    break;
	                }
	            }
	        }
	        if (allFilled) {
	            JOptionPane.showMessageDialog(this, "It's a draw!");
	            resetGrid(grid);
	        }
	    }

	    private void announceWinner(String winner) {
	        JOptionPane.showMessageDialog(this, winner + " has won!");
	        resetGrid(grid);
	    }

	    private void resetGrid(JButton[][] grid) {
	        for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 3; col++) {
	                grid[row][col].setText("");
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new TicTacToe();
	}

}
