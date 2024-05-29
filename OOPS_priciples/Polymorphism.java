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

======================================================================================
//output
Enter the radius of circle
10
Enter the length of rectangle
2
Enter the breadth of rectangle
5
The  area is : 
The  area is : 
314.0
10.0
