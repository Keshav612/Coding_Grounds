import java.io.*;
import java.util.Scanner;
public class FileHandling {
    public static void main(String args[]) throws IOException
    {

        File obj = new File("K1.txt");
        FileWriter obj2 = new FileWriter("K1.txt");
        Scanner obj3 = new Scanner(obj);
        try {
            
            if(obj.createNewFile()==true)
            {
                System.out.println("File created");
            }
            else
            {
                System.out.println("FIle exists");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error occured");
        }
        try {
            if (obj.canRead()) {
                System.out.println("File is readable");
                
            } else {
                System.out.println("File not readable");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error");
        }
        try {
            if (obj.canWrite()) {
                System.out.println("File is writable");
                
            } else {
                System.out.println("File not writable");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error while writing");
        }
        try {
            obj2.write("Hello World");
            obj2.close();
            System.out.println("Write succesful");
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error while writing");
        }
        try {
            while(obj3.hasNextLine())
            {
                String data=obj3.nextLine();
                System.out.println(data);

            }
            
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error while reading");
        }
    }
}
