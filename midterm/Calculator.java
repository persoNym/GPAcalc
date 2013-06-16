/**
 * @name                victoria c
 * @date revised        2/15/13
 * @description        gpa calculation
 * @model               1.0
 */
package calculator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date.*;

public class Calculator {

        
    public static void main(String[] args) {
       System.out.println("Midterm program by Victoria");
       java.util.Date date = new java.util.Date();
       System.out.println("Last acessed:" + date.toGMTString());
       try{
       Course CourseInstance = new Course(); //acquired course class
            CourseInstance.writeCourse();
           } 
        catch (Exception e) { 
            System.out.println("General exception: " + e );
        e.printStackTrace();
        
      }
       String fileName = "courses.txt", readLine;
     
      try //will print file to screen
        {
            BufferedReader in = new BufferedReader(
            new FileReader( fileName ) );
            readLine = in.readLine();
                while ( readLine != null )
                    {
               System.out.println( readLine );
                readLine = in.readLine();
                    }
                System.out.println("File printed to console");
                in.close();
                }
      
    catch ( Exception x )
        {
        System.out.print("File Not Found" + x);
        }
    }

  
}
