package com.devops.emiProject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class EMITest {

    @Test
    public void testValidEMI() {
        double emi = EMIMain.calculateEMI(100000, 10, 1);
        assertEquals(8791.59, emi, 0.5); 
    }

    @Test
    public void testInvalidEMI() {
        double emi = EMIMain.calculateEMI(200000, 12, 2);
        assertNotEquals(9000.00, emi, 0.5);
    }
}

