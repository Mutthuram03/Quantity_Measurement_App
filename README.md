# Quantity Measurement App

## Overview

The Quantity Measurement App is a Java-based application developed to model and manipulate different measurement systems. The project demonstrates the use of object-oriented design, Test Driven Development (TDD), and clean coding practices.

The application evolves incrementally through multiple use cases (UC1–UC9), starting from simple equality checks and progressing to a scalable system supporting multiple measurement domains such as length and weight.


## Technology Stack

* Java
* Git and GitHub
* Visual Studio Code


## Project Structure

```plaintext
quantity-measurement-app/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/apps/quantitymeasurement/
│   │           ├── QuantityMeasurementApp.java
│   │           ├── LengthUnit.java
│   │           ├── Weight.java
│   │           └── WeightUnit.java
│   │
│   └── test/
│       └── java/
│           └── com/apps/quantitymeasurement/
│               └── QuantityMeasurementAppTest.java
│
├── pom.xml
└── README.md
```

## Development Approach

### Test Driven Development (TDD)

* Write test cases first
* Implement minimal code to pass tests
* Refactor while maintaining correctness

### Design-Develop-Test (DDT)

* Design architecture
* Implement features
* Validate through testing

The project uses a hybrid approach combining both methodologies.

## Use Case Implementation

### UC1: Feet Equality

* Compare two values in feet
* Implemented using `equals()` method
* Handles null, type safety, and precision


### UC2: Feet and Inches Equality

* Introduced Inches measurement
* Independent comparison within same unit types


### UC3: Generic Length Model

* Replaced separate classes with a unified `Length` class
* Introduced `LengthUnit` enum
* Enabled cross-unit comparison


### UC4: Extended Units

* Added Yards and Centimeters
* Achieved scalability through enum extension


### UC5: Unit Conversion

* Implemented conversion between units
* Example: Feet to Inches, Centimeters to Feet


### UC6: Addition of Lengths

* Added support for combining two measurements
* Result returned in the base unit of the first operand


### UC7: Addition with Target Unit

* Extended addition functionality to support a specified output unit
* Example: result in yards or centimeters


### UC8: Refactoring for Clean Design

* Moved `LengthUnit` to a separate file
* Improved modularity and maintainability
* Followed Single Responsibility Principle


### UC9: Weight Measurement System

* Introduced a new domain: Weight
* Implemented `Weight` and `WeightUnit`
* Supported operations:

  * Conversion (kg, gram, pound)
  * Addition

## Key Concepts

* Object-Oriented Programming (OOP)
* Encapsulation and immutability
* Method overriding (`equals`, `hashCode`)
* Floating-point comparison using `Double.compare()`
* Enum-based design for unit handling
* Modular architecture
* Scalability across domains

## Running the Application

### Compile and Run

```bash
mvn compile
mvn exec:java
```

### Run Tests

```bash
mvn test
```

## Git Workflow

Each use case is implemented in a separate branch:

* main – stable version
* UC1-feet-equality
* UC2-feet-inch-equality
* UC3-generic-model
* UC4-extended-units
* UC5-unit-conversion
* UC6-addition
* UC7-target-unit
* UC8-refactor
* UC9-weight

Branches are merged into `main` after successful implementation and testing.

## Note

This project is developed as part of an academic exercise to demonstrate progressive system design, clean coding practices, and scalable architecture using Java.
