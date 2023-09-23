package org.example.array.array1d;

public class Person {
    private String name;
    private int age;
    private int id;

    public Person() {
        this.name = "Person Name";
        this.age = 0;
        this.id = 0;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
