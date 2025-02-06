package task1_1;

public class Person {
    private String name;
    private int age;

    
    public Person(String name) {
        this(name, 18);
    }

    // Constructor with custom age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
