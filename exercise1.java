package test.lab2HW;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Input the start:");
        int start = s.nextInt();
        
        Scanner b = new Scanner(System.in);

        System.out.println("Input the end:");
        int end = s.nextInt();
        
       for(int i= start; i<= end;i++) {
    	   System.out.print(i);
       }
//        System.out.println(start+end);

        s.close();
    }
}
