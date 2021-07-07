package fff;

import java.util.Arrays;
import java.util.Scanner;

public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner s= new Scanner(System.in);
	String a =s.nextLine();
 char[] arr=new char[a.length()];
 arr=a.toCharArray();
 int j=1;int k=0;
 char []h=new char[arr.length];
 Arrays.sort(arr);
 for(int i=0;i<arr.length;i++) 
	
	if (arr[i]=='+')
		{
		switch(j%2)
		{
		case(1):
			h[j]=arr[i];
		j= j+2;
		break;
	
	}
		
	 }
	else
		
		
		switch(k%2)
	{
	case(0):
		h[k]=arr[i];
	 k=k+2;
	break;

}
		

 
 

 for(int i=0;i<arr.length;i++) {
	 
	 System.out.print(h[i]);
 }}
}
	


