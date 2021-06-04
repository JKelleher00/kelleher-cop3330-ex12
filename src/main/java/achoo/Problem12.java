package achoo;
import java.util.*;
import java.text.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem12 {
    public static void main(String args[]){
         NumberFormat nf = NumberFormat.getCurrencyInstance();
         Scanner a = new Scanner(System.in);
         System.out.print("Enter the principal: ");
         double p = a.nextDouble();
         System.out.print("Enter the rate of interest: ");
         double i = a.nextDouble()/(double)100;
         System.out.print("Enter the number of years: ");
         double yr = a.nextDouble();
         double amt = Math.round(p*(1+i*yr)*100)/(double)100;
         System.out.println("After "+yr+" years at "+i*100+"% interest, the investment will be worth "+nf.format(amt));
    }
}
