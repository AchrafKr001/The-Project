/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.puzzlegame;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import org.mockito.stubbing.Answer;



/**
 *
 * @author SPECIAL
 */
public class PuzzleMocks {
    
    @Test
    public void testButtonPressMovesEmptySpace() {
        JButton b1 = Mockito.mock(JButton.class);
        JButton b2 = Mockito.mock(JButton.class);
        when(b2.getText()).thenReturn(" "); 

        puzzle game = new puzzle();
        game.b1 = b1;
        game.b2 = b2;

        
        game.actionPerformed(new ActionEvent(b1, ActionEvent.ACTION_PERFORMED, null));

        verify(b2).setText("1"); 
        verify(b1).setText(" ");

}
}
    
