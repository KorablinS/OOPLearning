package ru.synergy.constructorTest;

import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();
    }

}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;

        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add1ToNumerator() {

        this.numerator++;
        return this;
    }

    public Fraction getObjetCurrent() {
        return this;
    }


}

class Person {
    private String firstName;
    private String seconName;
    private char gender;  // m-male,  f-female


}