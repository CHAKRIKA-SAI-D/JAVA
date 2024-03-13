import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(x-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=x;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*(x-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
             System.out.println();
        } 
}
}
---------------------------------------------------------------------------------------------------------------------
#output:
  5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
