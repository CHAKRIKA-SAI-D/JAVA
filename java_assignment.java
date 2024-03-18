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
