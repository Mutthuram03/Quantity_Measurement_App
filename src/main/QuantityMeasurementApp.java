package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

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

        // UC5
        public double convertTo(LengthUnit targetUnit) {
            double inFeet = this.toBase();
            return targetUnit.fromFeet(inFeet);
        }

        // UC6
        public Length add(Length other) {
            double sumFeet = this.toBase() + other.toBase();
            double result = unit.fromFeet(sumFeet);
            return new Length(result, unit);
        }

        // UC7
        public Length add(Length other, LengthUnit targetUnit) {
            double sumFeet = this.toBase() + other.toBase();
            double result = targetUnit.fromFeet(sumFeet);
            return new Length(result, targetUnit);
        }

        public double getValue() {
            return value;
        }
    }
}