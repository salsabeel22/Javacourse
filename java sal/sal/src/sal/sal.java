package sal;

public class sal {
	public static int random(int a, int b)
{int x= a+ (int)(Math.random()*((Math.abs(b-a))+1)); 
return x;
	}
public static void main (String[] args) throws java.lang.Exception
{





System.out.println("random value from 500 to 1000="+ random(500,1000));

}}