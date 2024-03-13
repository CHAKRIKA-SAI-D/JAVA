import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            int s=x-i;
            for(int j=s;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
------------------------------------------------------------------------------
  #output:
4
   ****
  ****
 ****
****
