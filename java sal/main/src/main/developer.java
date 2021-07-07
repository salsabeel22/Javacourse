package main;

public class developer extends employ {
int bonus;
developer(int bonus){
	super(123,"technical support ",600);
	setbonus(bonus);
	
}
void setbonus(int bonus) {
	this.bonus=bonus;

}
int getbonus() {
return this.bonus;
		
}
public void print(){
	super.print();
	System.out.println("bonus="+bonus);
}
}
