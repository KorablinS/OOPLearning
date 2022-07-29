package ru.synergy.interfaceTest;

public class Main {
    public static void main(String[] args){
        Book book = new Book("Danwich horror", "Lafcraft");
    book.print();
    book.read("This is run uppon the book");
        Journal journal = new Journal("Cosmopolitan");
        journal.getName();
        journal.print();
        Printable printableJournal = journal;
        printableJournal.print();
    }
}
class Book implements Printable{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);

    }
}
class Journal implements Printable{
private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}