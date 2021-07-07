package sal;

public class B{
int id;
 public static int counter=0;
  B (int id){
	  setcount(id);
	  counter++;
  }
 public void  setcount (int id) {
	   this.id=id;
	   
   }
   int getid(){
	   return  this.id;
   }
   public void print() {
	   System.out.println("id="+id);
	
   System.out.println("count="+counter);
   }}

