/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.brickbreaker;

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.*;

public class GameplayTest {

    @Mock
    MapGenerator mapGenerator;

    @InjectMocks
    Gameplay gameplay;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGameStartsWithCorrectInitialState() {
        assertEquals(310, gameplay.playerX);
        assertFalse(gameplay.play);
    }
}

