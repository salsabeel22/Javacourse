package scanner;

public class scanner {
		import java.util.Scanner;
	public static void main(String[] args) {
	
		 
				
				// 6
				// 5 2 3 4 4 5
				// n = number of grades 
				// n numbers 
				// print the AVG and  the number of grades 
				// above avg
				Scanner in = new Scanner (System.in);
				int n ; 
				int sum = 0 ;
				double avg = 0;
				n = in.nextInt();
				

				int [] grade =new int [n];
				
				for (int i =0 ; i<n ; i++) {
					grade[i] = in.nextInt();
					sum  +=grade[i];
				}
				avg = sum*1.0  / n ;
				System.out.println(avg);
				int count  = 0;
				for (int i =0 ; i<n ; i++) {
					if(grade[i] > avg) { 
						count++;
						System.out.println("STUDENT No." + (i+1));
					}
				}
				System.out.println("count" + count);
				
			}}

		

