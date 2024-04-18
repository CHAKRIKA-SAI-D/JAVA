import java.util.*;
class StringToken {
    public static void main(String[] args) {
        System.out.println("Type 1 String tokenizer");
        StringTokenizer s=new StringTokenizer("hello world");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        System.out.println("Type 2 String tokenizer");
        StringTokenizer s1=new StringTokenizer("1999-12-20","-");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
        System.out.println("Type 3 String tokenizer");
        StringTokenizer s2=new StringTokenizer("1999-12-20","-",true);
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }
        
    }
}
------------------------------------------------------------------------------------
//output
Type 1 String tokenizer
hello
world
Type 2 String tokenizer
1999
12
20
Type 3 String tokenizer
1999
-
12
-
20
