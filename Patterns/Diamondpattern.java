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
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=x-1;i>=1;i--){
            int s=x-i;
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}

-----------------------------------------------------------------------------------------------------------------------
  #output:
  5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
