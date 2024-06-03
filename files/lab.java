//1. Write a program to write text to a file using FileWriter. (Write to a File)
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
class L4q1{
	public static void main(String args[]){
		try{
			FileWriter f=new FileWriter("file1.txt");
			f.write("hello world\n hello India\n");
			f.close();
		}catch(IOException e){
			System.out.println("Error");
		}
	}
}

//output
hello world
 hello India
----------------------------------------------------------------------------------------------
//2. Write a program to read text from a file using FileReader. (Read from a File)
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
class L4q2{
	public static void main(String args[]){
		try{
			FileReader f =new FileReader("file1.txt");
			int i=0;
			while((i=f.read())!=-1){
				System.out.println((char) i);
			}
		}catch(IOException e){
			System.out.println("Error");
		}
	}
}
//output
h
e
l
l
o
 
w
o
r
l
d


 
h
e
l
l
o
 
I
n
d
i
a
--------------------------------------------------------------------------
//3.Write a program to copy the contents of one file to another using FileInputStream and
FileOutputStream. (Copy a File)
  
