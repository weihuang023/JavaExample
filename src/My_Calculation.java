import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
		// TODO Auto-generated method stub
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
