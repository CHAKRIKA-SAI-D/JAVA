6. Geometry: Circle and Rectangle Classes with Constructors: Create Circle and Rectangle classes
representing geometric shapes. Implement constructors to initialize their properties like radius
(for circle) and length and width (for rectangle). Write a program to calculate the area and
perimeter of instances of these shapes.
import java.util.*;
class Area {
    double area;
    Area() {
        System.out.println("The  area is : ");
    }
    Area(int l,int b) {
        this();
        this.area =l*b;
    }
    Area(int r){
        this();
        this.area=3.14*r*r;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.println("Enter the length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
         int b=sc.nextInt();
        Area circle = new Area(rad);
        Area rectangle=new Area(l,b);
        System.out.println(circle.area);
        System.out.println(rectangle.area);
    }
}

#output
Enter the radius of circle
10
Enter the length of rectangle
2
Enter the breadth of rectangle
3
The  area is : 
The  area is : 
314.0
6.0
___________________________________________________________________________________________________________________________
1. Student Class with Constructor: Create a Student class with fields like name, rollNumber, and
grade. Implement a constructor to initialize these fields. Write a program to create instances of
Student using this constructor and display their details.
import java.util.*;
class Student {
    String name;
    int roll;
    char grade;
    Student(String name,int roll,char grade){
        this();
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    Student(){
        System.out.println("The datails are: ");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int roll=sc.nextInt();
        char grade=sc.next().charAt(0);
        Student s1=new Student(name,roll,grade);
        System.out.println(s1.name+" "+s1.roll+" "+s1.grade);
    }
}
#output
chakrika
1299
A
chakrika 1299 A
_______________________________________________________________________________________________________________
2. Bank Account with Parameterized Constructor: Develop a BankAccount class with fields such as
accountNumber, holderName, and balance. Include a parameterized constructor to initialize
these fields. Write a program to create instances of BankAccount using this constructor and
display their details
import java.util.*;
class Bank {
    int acc;
    String name;
    int bal;
    Bank(String name,int acc,int bal){
        this();
        this.name=name;
        this.bal=bal;
        this.acc=acc;
    }
    Bank(){
        System.out.println("Welcome User");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int acc=sc.nextInt();
        String name=sc.next();
        int bal=sc.nextInt();
        Bank s1=new Bank(name,acc,bal);
        System.out.println(s1.name+"  With account num : "+s1.acc+" and the balance is :  "+s1.bal);
    }
}
#output
123456789
Chakrika
100000000
Welcome User
Chakrika  With account num : 123456789 and the balance is :  100000000
_____________________________________________________________________________________________________________________
3. Vehicle Class with Default and Parameterized Constructors: Design a Vehicle class with attributes
like make, model, and year. Implement both default and parameterized constructors. Write a
program to create instances of Vehicle using these constructors and display their details.
import java.util.*;
class Vehicle {
    String model;
    int year;
    int price;
    Vehicle(String model,int year,int price){
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String model=sc.next();
        int year=sc.nextInt();
        int price=sc.nextInt();
        Vehicle h=new Vehicle(model,year,price);
        System.out.println("The brand is  " +model+" Since "+year+" with price "+price);
    }
}
#output
KTM
1990
100000
The brand is  KTM Since 1990 with price 100000

