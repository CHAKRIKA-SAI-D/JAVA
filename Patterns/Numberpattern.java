import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            int s=x-i;
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
}
}
--------------------------------------------------------------------------------------------------------
  #ouput:
5
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
