package oop_practice;

class Super_class{
	int num = 20;
	
	//display method of superclass
	public void display() {
		System.out.println("This is the display method of superclass");
	}
}

public class Sub_class extends Super_class {
	int num = 10;
	
	//display method of subclass
	public void display() {
		System.out.println("This is the display method of the sublclass");
	}
	
	public void my_method() {
		//Instantiating subclass
		Sub_class sub = new Sub_class();
		
		//Invoking the display() method of the sub class
		sub.display();
		
		//Invoking the display() method of the superclass
		super.display();
		
		//printing the value of the variable num of subclass
		System.out.println("value of the variable named num in sub class:" + sub.num);
		
		//printing the value of the variable num of superclass
		System.out.println("value of the variable named num in super class:" + super.num);
	}
	
	public static void main(String args[]) {
		Sub_class obj = new Sub_class();
		obj.my_method();
		obj.display();
		
	}
	

	

}
