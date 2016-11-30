import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Superclass{
	
	int age;
	
	Superclass (int age){
		this.age = age;
	}
	
	public void getAge(){		
		System.out.println("The value of the variable name age in super class is "+ age);
	}	
	
	int num = 20;
	 // display method of superclass
	public void display() {
	   System.out.println("This is the display method of superclass");
	}
}

class Subclass extends Superclass{
	Subclass(int age){
		super(age);
	}
	
	 int num = 10;
	 
	   // display method of sub class
	 public void display() {
	      System.out.println("This is the display method of subclass");
	 }
	 public void my_method() {
	      // Instantiating subclass
	      Subclass sub = new Subclass(24);;
	      // Invoking the display() method of sub class
	      sub.display();
	      // Invoking the display() method of superclass
	      super.display();
	      // printing the value of variable num of subclass
	      System.out.println("value of the variable named num in sub class:"+ sub.num);
	      // printing the value of variable num of superclass
	      System.out.println("value of the variable named num in super class:"+ super.num);
	 }
}

class Animal {}

class Mammal extends Animal {}

class Reptile extends Animal {}

class Dog extends Mammal{}


interface Vehicle{	 
	public void horsePower(int x);
	}
class speedLimit implements Vehicle{

	public void display(int x) {
	      System.out.println("this Vehicle has max speed "+x);
	 }

	public void horsePower(int x) {
		System.out.println("Vehicle has Minimum Horse "+x);
	}
}
class Van extends speedLimit{	 
	public void display() {
    System.out.print("This is Van ");
    super.display(22);
    super.horsePower(200);
	}
}
class Car extends speedLimit{
	 public void display() {
	      System.out.print("This is Car ");
	      super.display(40);
	      super.horsePower(100);
	 }
}

class Calculation {
	int result;
	
	public void addition(int x, int y){
		result = x + y;
		System.out.println("The sum of the given numbers: " +result);
	}
	
	public void subtraction(int x, int y){
		result = x - y;
		System.out.println("The different between the given numbers: "+result);
	}	
}

public class My_Calculation extends Calculation {
	private static Scanner in;

	public void multiplication(int x, int y){
		result = x * y;
		System.out.println("The different between the given numbers: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println(" ");
		Van v = new Van();
		Car c = new Car();
		c.display();
		v.display();
		
		System.out.println(" ");
		Subclass s = new Subclass(24);
		s.getAge();
		System.out.println(" ");
		s.my_method();
		
		Animal a1 = new Animal();
		Mammal m = new Mammal();
		Dog d = new Dog();
        System.out.println(" ");
		System.out.print("Mammal is Animal is ");
		System.out.println(m instanceof Animal);
		System.out.print("Dog is Mammal is ");
		System.out.println(d instanceof Animal);
		System.out.print("Animal is Mammal is ");
		System.out.println(a1 instanceof Mammal);
		System.out.print("Dog is Mammal is ");
		System.out.println(d instanceof Mammal);
		System.out.print("Mammal is Dog is ");
		System.out.println(m instanceof Dog);
		System.out.print("Animal is Dog is ");
		System.out.println(a1 instanceof Dog);
		
		System.out.println(" ");
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("G E yyyy.mm.dd 'at' hh:mm:ss a zzzX");
		System.out.println("Current Date: "+ft.format(dNow));
		in = new Scanner(System.in);
		System.out.print("Enter 1st #: ");
		int a = in.nextInt();
		System.out.print("Enter 2nd #: ");
		int b = in.nextInt();
	    My_Calculation demo = new My_Calculation();
	    demo.addition(a,b);
	    demo.subtraction(a, b);
	    demo.multiplication(a, b);
		
	}
}
