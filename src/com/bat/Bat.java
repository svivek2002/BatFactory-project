package com.bat;

public class Bat
{
	//	Properties of an object - 
	//	1) State - Data Members	
	//	2) Behavior - Methods
	//	3) Identity - 
	
	// All these below data members are states of an object
		
	int size;
	double price;
	String color;
	boolean guard;
	static int quantity;      //static are called class property and non-statics are object's property
	static String brandName; // keeping brandName static as it is common for all objects
							//  single copy of it will be made in class area, all the objects will share that copy
						   //   and it will not be given memory in objects
	
    // Below methods are behavior of an object
	
    // Static block - we can initialize static data member by the help of static block  
	// 				  so that the static member can be shown on top even if no object is created 	
	
	static 
	{
		quantity = 0;
		brandName = "REEBOK";
		System.out.println("!!********************************Cricket Bat Factory Project for "+brandName+"'s Bat************************************!!");
		System.out.println();
	}
	
//	Init block - will execute with respect to every constructor
	{
		quantity++;
	}
	
//	Default constructor - to create similar types of objects
	Bat()
	{
		size = 4;
		price = 1000.00;
		color = "white";
		guard = true;  
	}
	
//	Parameterized constructor - to create different types of objects
	Bat(int size, double price, String color, boolean guard)
	{
		this.size = size;
		this.price = price;
		this.color = color;
		this.guard = guard;
	}
	void showDetails()
	{
		System.out.println("Size of Bat : " + size);
		System.out.println("Price of Bat : " + price);
		System.out.println("Color of Bat : " + color);
		System.out.println("Guard Protected : " + guard);
		System.out.println("BrandName : " + brandName);
		System.out.println();
	}
	
	void changeGuardState()
	{
		guard = !guard; // toggle guard state
	}
//	if any method represents behavior of whole class and common to all objects then make it static
	static void countBat()
	{
		System.out.println("Total Number of Bats : " + quantity);
	}
	void changeCompanyName(String cname)
	{
		this.brandName = cname;
	}
	public static void main(String[] args) {
		
		Bat bat1 = new Bat();
		System.out.println("---------- Details of Bat1 ------------");
		bat1.showDetails();
		
		Bat bat2 = new Bat(3,850.56,"black",true);		
		System.out.println("---------- Details of Bat2 ------------");
		bat2.showDetails();
		bat2.changeGuardState();
		bat2.changeCompanyName("ADIDAS");
		System.out.println("---------- Updated Details of Bat2 ------------");
		bat2.showDetails();
		
		Bat bat3 = new Bat(5,2500.50,"wheatish",false);
		System.out.println("---------- Details of Bat3 ------------");
		bat3.showDetails();
		bat3.changeGuardState();
		bat3.changeCompanyName("KOOKABURRA");
		System.out.println("---------- Updated Details of Bat3 ------------");
		bat3.showDetails();
		
		Bat.countBat();
	}
}
