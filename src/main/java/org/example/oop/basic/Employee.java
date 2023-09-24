package org.example.oop.basic;

import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        setId(scanner.nextInt());

        System.out.print("Enter name: ");
        setName(scanner.nextLine());

        System.out.print("Enter salary: ");
        setSalary(scanner.nextDouble());
    }

    public void display() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}
