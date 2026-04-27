package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.0328084);

        private final double toFeetFactor;

        LengthUnit(double toFeetFactor) {
            this.toFeetFactor = toFeetFactor;
        }

        public double toFeet(double value) {
            return value * toFeetFactor;
        }

        public double fromFeet(double feetValue) {
            return feetValue / toFeetFactor;
        }
    }

    public static class Length {
        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        public double convertTo(LengthUnit targetUnit) {
            double inFeet = unit.toFeet(value);
            return targetUnit.fromFeet(inFeet);
        }
    }

    public static void main(String[] args) {
        Length length = new Length(1.0, LengthUnit.FEET);

        System.out.println("1 foot in inches: " +
                length.convertTo(LengthUnit.INCHES));

        System.out.println("1 foot in cm: " +
                length.convertTo(LengthUnit.CENTIMETERS));
    }
}