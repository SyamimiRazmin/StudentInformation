
package studentinformations;

import java.util.Scanner;
import java.util.Random;

public class StudentInformations {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
          
          String name;
          int matricNum; 
  
          
          System.out.print("Enter Name: ");
          name = scan.nextLine();
          System.out.print("Enter Matriks Number: ");
          matricNum=scan.nextInt();
          
          
          char nameChar = 'a';
          int i = 0 ;
          i++;
          
          Random random = new Random();
          int luckyNum = random.nextInt(100);
                  
                  
          System.out.println("\n********************* STUDENT INFORMATION**************************");
          System.out.println("\nName: " + name);
          System.out.println("Matric Number: " + matricNum);
          System.out.println("Name in Uppercase: " + name.toUpperCase());
          System.out.println("Name in Lowercase: " + name.toLowerCase());
          System.out.println("Name Length: " + name.length());
          System.out.println("Name divide into two: " + name.substring(0,5));
          System.out.println("                    : " + name.substring(6,13));
          System.out.println("Character a in name: " + i);
          System.out.println("My Lucky number: " + luckyNum);
          
     
  
}
}
   

