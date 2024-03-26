1. Java Program to Add Two Integers
  
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("the sum is : "+(x+y));
    }
}

#output:
100
111
the sum is : 211

  -------------------------------------------------------------------------
2. Java Program to Multiply two Floating Point Numbers

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        System.out.print("the multiplication is : "+(x*y));
    }
}

#output
111.236
258.301
the multiplication is : 28732.37

  ------------------------------------------------------------------------------
3. Java Program to Find ASCII Value of a character
  
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0); 
        System.out.print((int) x);
    }
}

#output
c
99
-------------------------------------------------------------------------------------
4. Java Program to Compute Quotient and Remainder

  import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Quotient is :"+(x/y));
        System.out.print("remzinder is : "+(x%y));
    }
}

#output
7
3
Quotient is :2
remzinder is : 1
_________________________________________________________________________________________________
5. Java Program to Swap Two Numbers
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.print(x+"\n"+y);
    }
}
#output
99
100
100
99
  ______________________________________________________________________________________________
6. Java Program to Check Whether a Number is Even or Odd

  import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
#output
101
Odd
_____________________________________________________________________________________
7. Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
#output
c
Consonant
_____________________________________________________________________________________
8. Java Program to Find the Largest Among Three Numbers
  import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.print(a);
        }else if(b>a&&b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
#output
99
-12
0
99
_______________________________________________________________________________________
9. Java Program to Check Leap Year
  import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 != 0 || a % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
#output
2012
Leap year
______________________________________________________________________________________
10. Java Program to Find Factorial of a Number
  import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result=1;
        while(a>1){
            result*=a;
            a--;
        }
        System.out.print(result);
    }
}
#output
5
120
______________________________________________________________________________________________
11. ava Program to Generate Multiplication Table
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(x+"x"+i+"="+x*i);
        }
    }
}
#output
5
5x1=5
5x2=10
5x3=15
5x4=20
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50
___________________________________________________________________________________
12. Java Program to Display Fibonacci Series
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int f1=0;
        int f2=1;
        if(x==1){
            System.out.println(f1);
        }else if(x==2){
            System.out.println(f1+" "+f2);
        }else{
            System.out.print(f1+" "+f2+" ");
            for(int i=3;i<=x;i++){
                int f3=f1+f2;
                System.out.print(f3+" ");
                f1=f2;
                f2=f3;
            }
        }
    }
}
#output
10
0 1 1 2 3 5 8 13 21 34 
___________________________________________________________________
13. Java Program to Find GCD of two Numbers
import java.util.*;
class Gcd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println("The gcd is : "+gcd);
    }
}
#output
81
153
The gcd is : 9
_______________________________________________________________
14. Java Program to Find LCM of two Numbers
import java.util.*;
class Lcm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=(x>y)?x:y;
        while(true){
            if(m%x==0 && m%y==0){
                System.out.print(m);
                break;
            }
            m++;
        }
    }
}
#output
2
3
6
__________________________________________________________________
15. Java Program to Display Alphabets (A to Z) using loop
import java.util.*;
class Alpha{
    public static void main(String[] args) {
        int c=65;
        for(int i=1;i<=26;i++){
            System.out.print((char)c+" ");
            c++;
        }
    }
}
#output:
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
____________________________________________________________________
16. Java Program to Count Number of Digits in an Integer
  import java.util.*;
class Count{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		while(x>0){
			x=x/10;
			x=(int) x;
			count++;
		}
		System.out.print("The length of digit is"+count);
	}
}
#output
100001
The length of digit is6
_____________________________________________________________________________
18. Java Program to Calculate the Power of a Number
import java.util.*;
class Power{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enterthe number");
		int num=sc.nextInt();
		System.out.println("Enter the power:");
		int po=sc.nextInt();
		int res=1;
		for (int i=0;i<po;i++){
			res=res*num;
		}
		System.out.println("The result is :" +res);
	}
}
#output
Enterthe number2
Enter the power:
30
The result is :1073741824
_______________________________________________________________________________
19. Java Program to Check Palindrome
import java.util.*;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            a[i]=x;
        }
        int flag=0;
        for(int i=0;i<n;i++){
            if(a[i]!=a[n-i-1]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print("Palindrome");
        }else{
            System.out.print("NO");
        }
    }
}
#output
3
1
2
1
Palindrome
-----------------------------------------------------------------------------------------------------------

