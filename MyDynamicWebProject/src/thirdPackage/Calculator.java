package thirdPackage;
import java.util.Scanner;
public class Calculator implements thirdPackageInterface {

	@Override
	public Integer add(Integer val1, Integer val2) {
		return val1 + val2;
	}

	@Override
	public Integer subtract(Integer val1, Integer val2) {
		return val1 - val2;
	}

	@Override
	public long multiply(Integer val1, Integer val2) {
		return val1 * val2;
	}

	@Override
	public Integer divide(Integer val1, Integer val2) throws ArithmeticException {
		return val1 / val2 ;
	}
	
	public static void main( String[] args )
	{
		Calculator calc = new Calculator();
		Integer val1, val2, choice;
		@SuppressWarnings("resource")
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your first number");
		val1 = input.nextInt();
		
		System.out.println("Enter your second number");
		val2 = input.nextInt();

		System.out.println("Enter choice :\n 1 : addition \n 2 : Subtraction \n 3 : Multiply \n 4 : Divide \n");
		choice = input.nextInt();
		
		switch( choice )
		{
		case 1:
			System.out.println( calc.add(val1, val2) );
			break;
			
		case 2:
			System.out.println( calc.subtract(val1, val2) );
			break;
			
		case 3:
			System.out.println( calc.multiply(val1, val2) );
			break;
			
		case 4:
			try
			{
				System.out.println( calc.divide(val1, val2) );
			}
			catch( ArithmeticException e)
			{
				System.out.println( "Cannot divide by zero" );
			}
			break;
			
		default:
			System.out.println( "Invalid option" );
		
		}
	}

}
