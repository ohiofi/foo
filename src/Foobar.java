import java.util.Scanner;

public class Foobar
{
	public static void main(String[] args)
	{
		int myInt;
		double myDouble;
		boolean myBoolean;
		char myChar;
		Scanner input = new Scanner(System.in);

		System.out.println( 5.1 % 2 );
		
		System.out.print("Gimme an int: ");
		myInt = input.nextInt();
		System.out.print("Gimme a double: ");
		myDouble = input.nextDouble();
		System.out.print("Gimme a boolean: ");
		myBoolean = input.nextBoolean();
		System.out.print("Gimme a char: ");
		myChar = input.next().charAt(0);
		
		System.out.println( );
		
		
		System.out.printf("%20s","Your int was...");
		System.out.printf("%10d",myInt);
		System.out.println();
		System.out.printf("%20s","Your double was...");
		System.out.printf("%10.2f",myDouble);
		System.out.println();
		System.out.printf("%20s","Double that is...");
		System.out.printf("%10.2f",myDouble*2);
		System.out.println();
		System.out.printf("%20s","Your boolean was...");
		System.out.printf("%10b",myBoolean);
		//myBoolean = !myBoolean;
		System.out.println();
		System.out.printf("%20s","The opposite is...");
		System.out.printf("%10b",!myBoolean);
		System.out.println();
		System.out.printf("%20s","Your char was...");
		System.out.printf("%10c",myChar);
		System.out.println();
		System.out.printf("%20s","The next char is...");
		//myChar++;
		System.out.printf("%10c",myChar + 1);
		
	}
}