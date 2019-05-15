/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * * A class that creates an Array of Students and populates it
 * with 3 students from the current section and then iterates over the
 * list to print each name.

 * @author Sivagama
 */
public class StudentTester {
    public static void main(String[] args)
    {
        //char[] pillbox=new char[7];
        //array of StudentDemo objects
        
        StudentDemo s1=new StudentDemo("Raghav Sharma");
        StudentDemo s2=new StudentDemo("Akshay");
        StudentDemo s3= new StudentDemo("Ark");
        
        
        StudentDemo[] list=new StudentDemo[3];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName());
        }
        
        }
        
    }
   

