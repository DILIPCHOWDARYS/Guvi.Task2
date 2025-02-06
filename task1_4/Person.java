package task1_4;



public class Person {
 protected String name;
 protected int age;

 // Constructor with default age as 18
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayPerson() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}
