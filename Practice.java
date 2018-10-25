import java.util.Scanner; 
public class Practice 
{
	public static void main(String[] args)
	{
		 System.out.println("I know how to print");
		 int int1 = 5;
		 double float1 = 5.0;
		 String string1 = "5.0 in a string";
		 System.out.println(int1);
		 System.out.println(float1);
		 System.out.println("\n" + string1);
		 
		 int1 *= 2;
		System.out.println(" \nint1: " + int1);
		 float1 *= int1;
		System.out.println("float1: " + float1);
		string1 += " but sans isnt real you cant be sans";
		System.out.println("string1: " + string1);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your favorate sport: ");
		String input = keyboard.nextLine();
		System.out.println("\n\n\n\nYour favorate sport is " + input + " and mine is riding");
		
		
	}
 

}
