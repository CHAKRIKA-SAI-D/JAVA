// Define a class representing a person with encapsulated fields
public class Person {
    // Private fields to store the person's data
    private String name;
    private int age;

    // Public constructor to initialize the person's data
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to demonstrate encapsulation
public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("Alice", 30);

        // Access and modify the person's data using getter and setter methods
        System.out.println("Before modification:");
        person.displayInfo();

        // Modify the person's data using setter methods
        person.setName("Bob");
        person.setAge(35);

        System.out.println("After modification:");
        person.displayInfo();

        // Attempt to set a negative age (demonstrating validation)
        person.setAge(-5);
    }
}
