# Java Gradle Project

## Overview
A Java educational project for practicing arrays, expressions, and program execution control. Contains an `Exercise` class with a `Calculate` method and a `TestResult` class that demonstrates the output.

## Project Structure
- `src/domain/Exercise.java` - Main domain logic class with the `Calculate` method
- `src/test/TestResult.java` - Entry point with `main` method that tests/demonstrates the Exercise class
- `build.gradle` - Gradle build configuration with JUnit 5 for testing

## How to Run
- The project uses Gradle with the `application` plugin
- Run via: `./gradlew run`
- The main class is `test.TestResult`

## Tech Stack
- Java (GraalVM CE 22.3.1)
- Gradle 8.14.2 (with wrapper)
- JUnit Jupiter 5.6.0 for testing
