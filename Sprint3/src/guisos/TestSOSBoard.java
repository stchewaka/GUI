package guisos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSOSBoard {

	
	@Test
    public void testIsBoardFullWhenBoardIsNotFull() {
		TestSOSBoard project = new TestSOSBoard();
        String[][] partiallyFilledBoard = new String[7][7]; // Replace with your board size
        partiallyFilledBoard[0][0] = "S";
        partiallyFilledBoard[1][1] = "O";
        boolean result = project.isBoardFull(partiallyFilledBoard);
        assertFalse(result);
    }
	private boolean isBoardFull(String[][] partiallyFilledBoard) {
		// TODO Auto-generated method stub
		return false;
	}
	@Test
    public void testIsBoardFullWhenBoardIsFull() {
		TestSOSBoard project = new TestSOSBoard();
        String[][] fullBoard = new String[7][7]; // Replace with your board size
        // Fill the entire board
        for (int i = 0; i < fullBoard.length; i++) {
            for (int j = 0; j < fullBoard[0].length; j++) {
                fullBoard[i][j] = "S";
            }
        }
        boolean result = project.isBoardFull(fullBoard);
        assertTrue(result);
    }

}