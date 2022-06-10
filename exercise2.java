package test.lab2HW;

import java.util.Scanner;

public class exercise2 {
	public static void main(String arg[])	
	{
	    int n;
            Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter a number :");
	      n=sc.nextInt();
	    
	    System.out.println("The sum of 1 to 10 is "+addUpTo(n));	  
	}
	static int addUpTo(int n)
	{
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		sum=sum+i;
	   }
	   return sum;
        } 
}
