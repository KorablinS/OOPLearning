package ru.synergy.constructorTest;

import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Konin","Oleg", 'm');
        System.out.println(oleg);

        Employee olga = new Employee("Svetova", "Olga", 'f', "buhgalter");


        System.out.println(olga);

        olga.tellMWhoAreU();



        Person olga2 = olga;
       // Employee oleg2 = oleg;
        System.out.println(olga2);
        ((Employee) olga2).tellMWhoAreU();


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
    protected String firstName;
    protected String lastName;
    protected char gender;  // m-male,  f-female

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public Person(){
        this("", "", '-');
    }
    public Person(String lastName){
        this(lastName, "", '-');
    }
    public Person(String lastName, String firstName, char gender){
        this(lastName, firstName);
        this.gender = gender;

    }

    public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;

    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
class Employee extends Person{

    protected String dolgnost;



    public Employee(String lastName, String firstName, char gender, String dolgnost) {
        super(lastName, firstName, gender);
        this.dolgnost = dolgnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dolgnost='" + dolgnost + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void tellMWhoAreU(){
        System.out.println("Hello, I'm employee, and my class is " + this.getClass());
    }
}

