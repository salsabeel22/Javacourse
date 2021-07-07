package sr;

import java.util.Scanner;

public class sr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner s=new Scanner (System.in);
String a= s.nextLine();
char[] arr= new char [a.length()];
arr =a.toCharArray();


for(int i=0;i<a.length();i++)
 {
	if(arr[i]=='1')
 {	System.out.print(arr[i]);
if(i!=a.length()-1)
{
	System.out.print("+");}


}
 else if (arr[i]=='2')
 { System.out.print(arr[i]);
	 if(i!=a.length()-1)
	 
	 	System.out.print("+");}

	 else if (arr[i]=='3') {
		 System.out.print(arr[i]);
		 if(i!=a.length()-1)
		 
		 	System.out.print("+");
	} 
}

} }