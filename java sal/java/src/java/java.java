package java;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in =new Scanner (System.in);
int n;
   n=in.nextInt();
   
int sum;
int i;
 for(i=1;i<=n;i++)
 {int grade=in.nextInt();
 sum+=grade;
 }
 double avr=sum/(double) n;
}}