package test.lab2HW;

import java.util.Scanner;

public class exercise3 {
	public static void main(String arg[])	
	{
	    
//        Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter a word :");
//	    String n =sc.next();
	    
//	    System.out.print(n.length());
	    
//	   for(int i=1; i>=n.length() ; i++) {
//	    System.out.println(n);	  }
	    
	   System.out.println("Enter word");
	   Scanner input=new Scanner(System.in);
	   String word=input.next();
	   
	   int len=word.length();
//	     System.out.println();
	   for(int i=0;i<len;i++){
	     System.out.print(word+" ");
	   }
//	
	}
}
