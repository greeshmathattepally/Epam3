package com.epam3.design_principles;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        Addition add=new Addition();
        Subtraction sub=new Subtraction();
        Multiplication mul=new Multiplication();
        Division div=new Division();
        System.out.println("Select option\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        
        
        int ch=sc.nextInt();
        System.out.println("Enter 2 numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        switch(ch)
        {
        case 1: System.out.println(add.calculateResult(n1, n2));
                break;
        case 2: System.out.println(sub.calculateResult(n1, n2));
                 break;
        case 3: System.out.println(mul.calculateResult(n1, n2));
                break;
        case 4: System.out.println(div.calculateResult(n1, n2));
                break;
        default: System.out.println("Select option between 1-4");
        
        }
        sc.close();
    }
}
