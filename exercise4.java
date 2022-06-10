package test.lab2HW;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
 	   System.out.println("How many integers will be added?");
 	   Scanner input=new Scanner(System.in);
 	   int time=input.nextInt();
 	   
 	   int sum=0;
 	  for(int i=0;i <time;i++){
 	     System.out.println("Enter an integer:");
 	     Scanner x=new Scanner(System.in);
  	     int a=input.nextInt();
  	     
  	     sum= sum+a; 
 	   }
    System.out.println(sum);
}
}
