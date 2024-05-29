import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        File f=new File("file.txt");
	        if(f.createNewFile()){
	            System.out.println("File created : "+f.getName());
	        }else{
	            System.out.println("File already exists");
	        }
	    }catch(IOException e){
	        System.out.println("error");
	    }
		
	}
}
===========================================================
  //output:
  //if file already exists then
  File already exists
  //if file not created then
  File created 
  //creates and opens the file
  
  
