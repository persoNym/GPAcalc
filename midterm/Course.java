/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;


import java.util.Scanner;
import java.io.*;

public class Course {

  
    Scanner sc = new Scanner(System.in);  
    



 public void writeCourse() //appends data to course
    {
       
        try { //appends data to the file of course with not keyboard input
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("courses.txt", true))); 
            out.println("CS 604 Introduction to C Programming");
            out.println("Grade: A");
            out.println(" ");
            out.println("CS 610 Itermediate Programmig in C");
            out.println("Grade: C");
            out.println(" ");
            out.println("CS 622 Database Systems");
            out.println("Grade: A");
            out.println(" ");
            out.println("CS 646 Introduction to Computer Security");
            out.println("Grade: B");
            out.println(" ");
            PrintWriter printf = out.printf("GPA: " + 13/4.0);
            out.println(" ");
            out.flush();
            out.close();
            System.out.print("Courses has been saved to courses.txt\n");
            
            
        }
        catch (IOException except) {
            System.out.print("Exception found:" + except);
    
        }
 }
 
 
}
 
