import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String r="";
        for(int i=0;i<x;i++){
            if(i%2==0){
                r="1"+r;
                System.out.print(r);
            }else{
                r="0"+r;
                System.out.print(r);
            }
            System.out.println();
        }
}
}

-------------------------------------------------------------------------------------------------------
  #output:
10
1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101
