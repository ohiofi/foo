import java.util.Scanner;

public class Foobar
{
	public static void main(String[] args)
	{
		String foo = "Agent" + 0 + 0 + (3 + 4);
		System.out.println("Line 8 = " + foo);
		foo = 0 + 0 + 3 + 4 + "Agent";
		System.out.println("Line 10 = " + foo);
		foo.replace("t","da");
		System.out.println("Line 12 = " + foo);
		foo.substring(1,3);
		System.out.println("Line 14 = " + foo);
		foo.charAt(0);
		System.out.println("Line 16 = " + foo.length());
		
//		int myInt;
//		double myDouble;
//		boolean myBoolean;
//		char myChar;
//		Scanner input = new Scanner(System.in);
		
//		System.out.print("Please enter the price for a six-pack of soda: ");
//		double packPrice = input.nextDouble();
//		// Read price per bottle
//		System.out.print("Please enter the price for a two-liter bottle of soda: ");
//		double bottlePrice = input.nextDouble();
//		
//		final double CANS_PER_PACK = 6;
//		final double CAN_VOLUME = 0.355; // 12 oz. = 0.355 l
//		final double BOTTLE_VOLUME = 2;
//		
//		// Compute and print price per liter
//		double packPricePerLiter = packPrice / (CANS_PER_PACK * CAN_VOLUME);
//		double bottlePricePerLiter = bottlePrice / BOTTLE_VOLUME;
//		
//		System.out.printf("Pack price per liter:   %8.2f", packPricePerLiter);
//		System.out.println();
//		System.out.printf("Bottle price per liter: %8.2f", bottlePricePerLiter);
//		System.out.println();
//		
//		
//		System.out.println(10.1 % 2);
//
//		System.out.println( 5.1 % 2 );
//		
//		System.out.print("Gimme an int: ");
//		myInt = input.nextInt();
//		System.out.print("Gimme a double: ");
//		myDouble = input.nextDouble();
//		System.out.print("Gimme a boolean: ");
//		myBoolean = input.nextBoolean();
//		System.out.print("Gimme a char: ");
//		myChar = input.next().charAt(0);
//		
//		System.out.println( );
//		
//		System.out.printf("%20s","Your int was...");
//		System.out.printf("%10d",myInt);
//		System.out.println();
//		System.out.printf("%20s","Your double was...");
//		System.out.printf("%10.2f",myDouble);
//		System.out.println();
//		System.out.printf("%20s","Double that is...");
//		System.out.printf("%10.2f",myDouble*2);
//		System.out.println();
//		System.out.printf("%20s","Your boolean was...");
//		System.out.printf("%10b",myBoolean);
//		//myBoolean = !myBoolean;
//		System.out.println();
//		System.out.printf("%20s","The opposite is...");
//		System.out.printf("%10b",!myBoolean);
//		System.out.println();
//		System.out.printf("%20s","Your char was...");
//		System.out.printf("%10c",myChar);
//		System.out.println();
//		System.out.printf("%20s","The next char is...");
//		//myChar++;
//		System.out.printf("%10c",myChar + 1);
		//myBoolean = !myBoolean;
		//myChar++;
		
	}
}