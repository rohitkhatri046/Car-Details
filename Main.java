class Car
{
	String name;
	int model;
	String color;
}
public class Main
{
	public static void main(String[] args)
	{
		Car obj1 = new Car();
		obj1.name = "Cultus";
		obj1.model = 2022;
		obj1.color = "White";
		System.out.println("Car Details 1:");
		System.out.println("NAME:"+ obj1.name);
		System.out.println("MODEL:"+ obj1.model);
		System.out.println("COLOR:"+ obj1.color);

		Car obj2 = new Car();
		obj2.name = "Alto";
		obj2.model = 2024;
		obj2.color = "Red";
		System.out.println("Car Details 2:");
		System.out.println("NAME:"+ obj2.name);
		System.out.println("MODEL:"+ obj2.model);
		System.out.println("COLOR:"+ obj2.color);

		Car obj3 = new Car();
		obj3.name = "Altius";
		obj3.model = 2025;
		obj3.color = "Gery";
		System.out.println("Car Details 3:");
		System.out.println("NAME:"+ obj3.name);
		System.out.println("MODEL:"+ obj3.model);
		System.out.println("COLOR:"+ obj3.color);
	}
}