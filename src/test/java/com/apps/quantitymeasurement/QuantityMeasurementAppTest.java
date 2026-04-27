package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Length;
import com.apps.quantitymeasurement.QuantityMeasurementApp.LengthUnit;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetToInches() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertEquals(12.0, l.convertTo(LengthUnit.INCHES), 0.001);
    }

    @Test
    public void testFeetToCm() {
        Length l = new Length(1.0, LengthUnit.FEET);
        assertEquals(30.48, l.convertTo(LengthUnit.CENTIMETERS), 0.1);
    }

    @Test
    public void testInchesToFeet() {
        Length l = new Length(12.0, LengthUnit.INCHES);
        assertEquals(1.0, l.convertTo(LengthUnit.FEET), 0.001);
    }

    @Test
    public void testYardsToFeet() {
        Length l = new Length(1.0, LengthUnit.YARDS);
        assertEquals(3.0, l.convertTo(LengthUnit.FEET), 0.001);
    }

    @Test
    public void testCmToFeet() {
        Length l = new Length(30.48, LengthUnit.CENTIMETERS);
        assertEquals(1.0, l.convertTo(LengthUnit.FEET), 0.1);
    }
}