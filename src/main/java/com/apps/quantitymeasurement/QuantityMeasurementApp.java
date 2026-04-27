package com.apps.quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurementApp {

    // Feet class
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    // Inches class
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    // Demo methods (as per UC2)
    public static void demonstrateFeetEquality() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Feet: 1.0 == 1.0 -> " + f1.equals(f2));
    }

    public static void demonstrateInchesEquality() {
        Inches i1 = new Inches(10.0);
        Inches i2 = new Inches(10.0);
        System.out.println("Inches: 10.0 == 10.0 -> " + i1.equals(i2));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}