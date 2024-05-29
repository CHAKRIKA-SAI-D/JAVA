import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter f2 = new FileWriter("file2.txt");
            File f = new File("file.txt");
            Scanner sc = new Scanner(f);
            // Copying content from file.txt to file2.txt
            while (sc.hasNextLine()) {
                String x = sc.nextLine();
                f2.write(x + "\n");
            }
            // Closing the FileWriter and Scanner
            f2.flush();
            f2.close();
            sc.close();
            // Reading and printing the content of file.txt
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
==========================================================================
//output
hello world
hello india
