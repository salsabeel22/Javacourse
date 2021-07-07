package main;


public class student extends person{
	String student_id;
	double gpa;
	String claas;
	student(String id,double gpa,String claas){
	super("salsabeel","2/8/1998",'f',9820,"0782699050","salsabeelalodainat@yahoo.com");	
	setstudent_id(id);
	setgpa(gpa);
	setclaas(claas);
	}
	void setstudent_id(String id) {
		this. student_id=id;
	}
	
	void setgpa(double gpa) {
		this. gpa=gpa;
	}
	void setclaas(String claas) {
		this. claas=claas;
	}
	
String getstudent_id() {
	return this.student_id;

}
double getgpa() {
	return this.gpa;

}
String getclaas() {
	return this.claas;

}
	public void print() {
		super.print();
		System.out.println("studentid="+student_id);
		System.out.println("gpa="+gpa);
		System.out.println("claas="+claas);
	}
}
