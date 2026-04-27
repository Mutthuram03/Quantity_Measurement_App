package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Length;
import com.apps.quantitymeasurement.QuantityMeasurementApp.LengthUnit;

public class QuantityMeasurementAppTest {

    // ===== UC5 TESTS (Conversion) =====

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

    // ===== UC6 TEST (Addition) =====

    @Test
    public void testAdditionFeetAndInches() {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length result = l1.add(l2);

        assertEquals(2.0, result.getValue(), 0.001);
    }
    
    @Test
public void testAdditionWithTargetUnit() {
    Length l1 = new Length(1.0, LengthUnit.FEET);
    Length l2 = new Length(12.0, LengthUnit.INCHES);

    Length result = l1.add(l2, LengthUnit.YARDS);

    assertEquals(0.666, result.getValue(), 0.01);
}

    @Test
    public void testWeightConversion() {
        Weight w = new Weight(1.0, WeightUnit.KILOGRAM);

        assertEquals(1000.0, w.convertTo(WeightUnit.GRAM), 0.01);
    }

    @Test
    public void testWeightAddition() {
        Weight w1 = new Weight(1.0, WeightUnit.KILOGRAM);
        Weight w2 = new Weight(500.0, WeightUnit.GRAM);

        Weight result = w1.add(w2);

        assertEquals(1.5, result.getValue(), 0.01);
    }
}
}