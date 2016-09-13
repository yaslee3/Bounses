import java.util.Scanner;

public class StudentGradesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Letter Grade Converter!");
		
		
		int grade;
		String response;
		
		do{
			System.out.println("Enter a numerical grade:");
			int a = scan.nextInt();
			
			if (a >= 88 && a <= 100) {
				System.out.println("Letter Grade:A");
		}
			if (a >= 80 && a <= 87) {
				System.out.println("Letter Grade:B");
				}
			if (a >= 67 && a <=79) {
				System.out.println("Letter Grade:C");
			}
			if (a >= 60 && a <=66) {
				System.out.println("Letter Grade:D");
			}
			if (a >= 0 && a <=59) {
				System.out.println("Letter Grade:F");
			}
			System.out.print("Continue:(y/n):");
			response=scan.next();
		} while (response.equals("y") || response.equals("Y"));
		System.out.println("Bye!");
		
		


	}

}
