package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_SameValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquality_DifferentValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testEquality_NullComparison() {
        Feet f1 = new Feet(1.0);
        assertFalse(f1.equals(null));
    }

    @Test
    public void testEquality_DifferentClass() {
        Feet f1 = new Feet(1.0);
        String obj = "test";
        assertFalse(f1.equals(obj));
    }

    @Test
    public void testEquality_SameReference() {
        Feet f1 = new Feet(1.0);
        assertTrue(f1.equals(f1));
    }

    @Test
    public void testEquality_PrecisionCheck() {
        Feet f1 = new Feet(1.0000001);
        Feet f2 = new Feet(1.0000001);
        assertTrue(f1.equals(f2));
    }
}