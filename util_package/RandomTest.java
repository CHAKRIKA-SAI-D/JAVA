import java.util.*;
public class RandomTest{
    public static void main(String [] args){
        Random r=new Random();
        System.out.println(r.nextBoolean());
        //only for Integers we can give range but not for float and double
        System.out.println(r.nextInt(10));
        System.out.println(r.nextFloat());
        System.out.println(r.nextDouble());
        //only number family have random
    }
}
___________________________________________________________________________________
//output
false
8
0.5806683
0.08414550065354132
