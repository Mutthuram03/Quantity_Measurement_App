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

        private double toBase() {
            return unit.toFeet(value);
        }

        // UC5 - Conversion
        public double convertTo(LengthUnit targetUnit) {
            double inFeet = this.toBase();
            return targetUnit.fromFeet(inFeet);
        }

        // UC6 - Addition (same unit)
        public Length add(Length other) {
            double sumFeet = this.toBase() + other.toBase();
            double result = unit.fromFeet(sumFeet);
            return new Length(result, unit);
        }

        // ✅ UC7 - Addition with target unit
        public Length add(Length other, LengthUnit targetUnit) {
            double sumFeet = this.toBase() + other.toBase();
            double result = targetUnit.fromFeet(sumFeet);
            return new Length(result, targetUnit);
        }

        public double getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        System.out.println("1 foot in inches: " +
                l1.convertTo(LengthUnit.INCHES));

        System.out.println("1 ft + 12 inches (feet): " +
                l1.add(l2).getValue());

        System.out.println("1 ft + 12 inches (yards): " +
                l1.add(l2, LengthUnit.YARDS).getValue());
    }
}