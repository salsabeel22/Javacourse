package main;

public class employ extends person {
long employ_id;
 String job_position;
 int salary;
 employ(long id, String position,int salary){
	 super("salsabeel","2/8/1998",'f',9820,"0782699050","salsabeelalodainat@yahoo.com");	
	 setemployid(id);
	 setjob_position(position);
	 setsalary(salary);
}
 void setemployid(long id) {
	 this.employ_id=id;
 }
 void setjob_position(String position) {
	 this.job_position=position;
}
 void setsalary(int salary) {
	 this.salary=salary;
 }
 long getemployid() {
	 return this.employ_id;}
String getjob_position() {
	 return this.job_position;}
int getsalary() {
	 return this.salary;}
 public void print() {
	 super.print();
	 System.out.println("employid="+employ_id);
	 System.out.println("job_position="+job_position);
	 System.out.println("salary="+salary);
	 
 }

 }
