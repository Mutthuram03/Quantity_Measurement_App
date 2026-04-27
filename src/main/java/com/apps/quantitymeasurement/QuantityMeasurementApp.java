package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurementApp {

    // Enum for all supported units
    public enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.0328084);

        private final double toFeet;

        LengthUnit(double toFeet) {
            this.toFeet = toFeet;
        }

        public double toFeet(double value) {
            return value * toFeet;
        }
    }

    // Generic Length class
    public static class Length {
        private final double value;
        private final LengthUnit unit;

        public Length(double value, LengthUnit unit) {
            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }
            this.value = value;
            this.unit = unit;
        }

        // Convert to base unit (Feet)
        private double toBase() {
            return unit.toFeet(value);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;

            Length other = (Length) obj;
            return Double.compare(this.toBase(), other.toBase()) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(toBase());
        }
    }

    // Demo
    public static void main(String[] args) {

        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        Length l3 = new Length(1.0, LengthUnit.YARDS);
        Length l4 = new Length(3.0, LengthUnit.FEET);

        Length l5 = new Length(30.48, LengthUnit.CENTIMETERS);
        Length l6 = new Length(1.0, LengthUnit.FEET);

        System.out.println("1 ft == 12 inches -> " + l1.equals(l2));
        System.out.println("1 yard == 3 feet -> " + l3.equals(l4));
        System.out.println("30.48 cm == 1 foot -> " + l5.equals(l6));
    }
}