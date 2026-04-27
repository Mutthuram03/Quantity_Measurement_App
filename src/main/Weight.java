package com.apps.quantitymeasurement;

public class Weight {

    private final double value;
    private final WeightUnit unit;

    public Weight(double value, WeightUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toBase() {
        return unit.toBase(value);
    }

    // Addition
    public Weight add(Weight other) {
        double sumKg = this.toBase() + other.toBase();
        double result = unit.fromBase(sumKg);
        return new Weight(result, unit);
    }

    // Conversion
    public double convertTo(WeightUnit targetUnit) {
        double inKg = this.toBase();
        return targetUnit.fromBase(inKg);
    }

    public double getValue() {
        return value;
    }
}