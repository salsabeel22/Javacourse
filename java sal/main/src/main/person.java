package main;

public class person {
public String name;
public String date_of_birth;
public char gender;
public int national_id;
public String phone_num;
public String email;
person(String name,String date,char gender,int nationalid, String phonenum,String email){
	setName(name);
	setdate_of_birth(date);
	setgender( gender);
	
	 setnational_id(nationalid );
	 setphone_num( phonenum);
	 setemail( email);
	 
}


void setName(String name) {
	this.name=name;
}

void setdate_of_birth(String date) {
	this.date_of_birth=date;
}
void setgender(char gender) {
	this.gender=gender;
}
void setnational_id(int id) {
	this.national_id=id;
}
void setphone_num(String num) {
	this.phone_num=num;
}
void setemail(String email) {
	this.email=email;
}

String getname() {
	return this.name;}
String getdate_of_birth() {
	return this.date_of_birth;}
char getgender() {
	return this.gender;}
int getnational_id() {
	return this.national_id;}
String getphone_num() {
	return this.phone_num;}
String getemail() {
	return this.email;}


public void print() {
	System.out.println("name="+name);
	System.out.println("date birthday="+date_of_birth);
	System.out.println("gender male or femal="+gender);
	System.out.println("nationalid="+national_id);
	System.out.println("phonenum="+phone_num);
	System.out.println("email="+email);
	
}
}

