import java.io.*;
import java.io.FileWriter;
public class Main
{
	public static void main(String[] args) {
	    try{
	        FileWriter f=new FileWriter("file.txt");
	        f.write("hello world");
	        f.close();
	        System.out.println("Completd succesfully");
	    }catch(IOException e){
	        System.out.println("error");
	    }
		
	}
}
=================================================================
  //output
Completd succesfully
//message is copied to required file
