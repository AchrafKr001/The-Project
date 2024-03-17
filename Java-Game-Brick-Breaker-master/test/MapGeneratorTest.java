/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MapGeneratorTest {
    
    private MapGenerator mapGenerator;
    
    @Before
    public void setUp() {
        // Initialize MapGenerator with a known configuration before each test
        mapGenerator = new MapGenerator(3, 7); // 3 rows, 7 columns for example
    }
    
    @After
    public void tearDown() {
        // Clean up resources, if any, after each test
    }
    
    @Test
    public void testInitialBrickConfiguration() {
        // Test that all bricks are initialized (value should be 1)
        for (int i = 0; i < mapGenerator.map.length; i++) {
            for (int j = 0; j < mapGenerator.map[i].length; j++) {
                assertEquals("Brick should be initialized to 1", 1, mapGenerator.map[i][j]);
            }
        }
    }
    
    @Test
    public void testSetBrickValue() {
        // Change the value of a specific brick
        mapGenerator.setBrickValue(0, 1, 3); // Set the value of brick at row 1, column 3 to 0
        assertEquals("Brick value should be set to 0", 0, mapGenerator.map[1][3]);
    }
}

