package alodainat;

import java.util.Scanner;

public class alodainat {
	
	
	 
	 public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String d=s.nextLine();
	char[] arr= new char[d.length()];
	char[] srr=new char [d.length()];
	char[] rr=new char [d.length()];
	char[] xx=new char [d.length()];
	arr =d.toCharArray();
	   String f=d.toUpperCase();
	   srr = f.toCharArray();
		 int c=0;
		
		   if (arr.equals(srr)) {
	String W= f.toLowerCase();
		rr=W.toCharArray();
		
		  for (int i=0; i<d.length();i++) {
		 System.out.print(rr[i]);
		  
		   
		  }}
		   
		   else if( arr[c]==srr[c] && arr[c+1]!=srr[c+1])
		   {  
			   
	
			 String k= d.toLowerCase();
			  xx = k.toCharArray();
			  String m= d.toUpperCase();
			  rr=m.toCharArray();
			  
			  System.out.print(xx[0]);
       for (int i=1; i<d.length();i++)
    	   
	 System.out.print(rr[i]);}
			

		   else if (arr!=srr)
			{    for (int i=0; i<d.length();i++)
		   System.out.print(arr[i]);
			  
			   
}}}

