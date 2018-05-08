package oop_practice;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog Spot = new Dog("Spot", 4, "Beagle");
		
		Spot.setAge(9);
		
		//-----------------------------------------------------------------------------------------
		// Calling Calculations and My_Calculations for learning Inheritance
		int a = 20, b = 10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.subtraction(a, b);
		demo.multiplication(a, b);
		
		
		
		

	}

}
