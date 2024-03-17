package com.mycompany.puzzlegame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PuzzleTest {

    private puzzle game;

    @BeforeEach
    void setUp() {
        // Initialize the game before each test
        game = new puzzle();
    }

    @Test
    void testInitialSetup() {
        // Test initial setup of the game, for instance, checking if the 'next' button works as expected.
        game.next.doClick();
        // Check some conditions to validate the initial setup
        assertNotEquals(" ", game.b1.getText(), "Button 1 should not be empty after setup.");
        // Add more assertions as needed
    }

    @Test
    void testButtonSwap() {
        // Simulate a button swap, for example, between b1 and b2 if it's allowed
        String originalB2Text = game.b2.getText();
        game.b1.doClick(); // Assuming b2 is empty and adjacent to b1, this should swap their labels

        // Verify the swap occurred
        assertEquals(originalB2Text, game.b1.getText(), "Button 1 should now have the text of button 2.");
        // More assertions can be added to check the state of the board
    }

    @Test
    void testWinCondition() {
        // Set up a winning condition manually
        game.b1.setText("1");
        game.b2.setText("2");
        game.b3.setText("3");
        game.b4.setText("4");
        game.b5.setText("5");
        game.b6.setText("6");
        game.b7.setText("7");
        game.b8.setText("8");
        game.b9.setText(" ");

        game.b9.doClick(); // Assuming this triggers the check for a win condition

        // You might need a way to check for the win programmatically since the original method shows a dialog
        // This could be adding a method or variable in your puzzle class to check if the game is won, for testing.
        assertTrue(checkGameWon(game), "The game should be in a won state.");
    }

    private boolean checkGameWon(puzzle game) {
        // This method would ideally be part of your `puzzle` class to check the win condition programmatically
        return game.b1.getText().equals("1") && game.b2.getText().equals("2") && // and so on for all buttons
               game.b9.getText().equals(" "); // Ensure the last button is empty
    }
}
