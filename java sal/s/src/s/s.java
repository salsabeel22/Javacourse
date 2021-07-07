package s;

import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		
		int n;
		   n=in.nextInt();
		   int[] arr=new int [n];
		int sum=0;
		int i;
		 for(i=0;i<n;i++)
		 {arr[i]=in.nextInt();
		 sum+=arr[i];
		 }
		 double avr=sum/(double) n;
		 System.out.println(avr);
		 int count=0;
		 for(i=0;i<n;i++) {
		 if (arr[i]>avr)
			 {count++;
		 System.out.println("student number"+ (i+1) ); }}
		 
		 
	System.out.println(count);
	}}
	


