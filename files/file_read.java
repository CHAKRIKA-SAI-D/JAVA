import java.io.*;
import java.io.FileWriter;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        File f=new File("file.txt");
	        Scanner sc=new Scanner(f);
	        while(sc.hasNextLine()){
	            System.out.println(sc.nextLine());
	        }
	        sc.close();
	    }catch(IOException e){
	        System.out.println("error");
	    }
		
	}
}
==================================================================
  //output
  //if file exists then prints line by line
  //if file not exists prints error
