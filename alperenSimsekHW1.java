/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        double maxGPA;
        double GPA;
        double NGPA;
        int semester;
        int credit;
        int written;
        double weight;
        
        System.out.println("What is the maximum GPA score in your previous university?:");
        
        maxGPA=input.nextInt();
        
        System.out.println("Please enter your GPA:");
        
        GPA=input.nextDouble();
        
        NGPA = GPA / maxGPA * 4;
        
        if (NGPA < 3)
        {
            System.out.println("You are rejected!Your GPA is not enough.");
        }
        
        else
        {
            System.out.println("Please enter how many semester have you studied:");
        
            semester=input.nextInt();
            
            if (semester > 4)
            {
                System.out.println("You are rejected!The number of semesters have you studied should be less than 5");
            }
            else
            {
                System.out.println("Enter  your credits:");
        
                credit=input.nextInt();
                
                if (credit < semester * 10)
                {
                    System.out.println("You are rejected!Your credits are not enough to take written exam.");
                }
                else
                {
                    System.out.println("Congratulations!You can take the written exam\nPlease enter your written exam note:");
        
                    written=input.nextInt();
                    
                    if (written < 60)
                    {
                        System.out.println("You are rejected!Your written exam note is not enough.");
                    }
                    else
                    {
                        weight=((NGPA-3)*40)+(written*60/100);
                            
                        System.out.println("Welcome to our university!\nYour score is: "+weight);
                    }
                }
            }
             

        }
                
              
                
            
        }
        



        }
       
        
           
            
            
       
            
        
            
            
        
        
      
            
        
        
            
            
            
            
        
        
                
        
        
        
                
    


    

