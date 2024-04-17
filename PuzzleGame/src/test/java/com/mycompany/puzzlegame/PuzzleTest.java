/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.puzzlegame;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.mycompany.puzzlegame.puzzle;
import javax.swing.JButton;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class PuzzleTest {


    @Test
    public void testWinningCondition() {
        puzzle game = new puzzle();
        // Assuming you have a method to setup the game state for testing or mock user actions
        game.b1.setLabel("1");
        game.b2.setLabel("2");
        game.b3.setLabel("3");
        game.b4.setLabel("4");
        game.b5.setLabel("5");
        game.b6.setLabel("6");
        game.b7.setLabel("7");
        game.b8.setLabel("8");
        game.b9.setLabel(" "); // The empty tile
        assertTrue("The game should be in a winning state", game.isGameWon());
    }
private puzzle puzzle;

    @Before
    public void setUp() {
        puzzle = new puzzle();
    }

    @Test
    public void testButtonDisplay() {
        JButton[] buttons = {puzzle.b1, puzzle.b2, puzzle.b3, puzzle.b4, puzzle.b5, puzzle.b6, puzzle.b7, puzzle.b8, puzzle.b9};
        for (JButton button : buttons) {
            assertEquals("JButton", button.getClass().getSimpleName());
        }
    }
    @Test
    public void testButtonInitialization() {
        puzzle puzzle = new puzzle();
        assertNotNull(puzzle.b1, "Button b1 should not be null after initialization");
        assertNotNull(puzzle.b2, "Button b2 should not be null after initialization");
        // Continue for other buttons
    }
}

