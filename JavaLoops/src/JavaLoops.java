import java.util.Scanner;
public class JavaLoops {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your marks:");
		int marksOfStudent = scanner.nextInt();
		if ( marksOfStudent <0 || marksOfStudent >100 ){
			System.out.println("Marks should be within 0 and 100");
		}
		else if ( marksOfStudent >= 80 && marksOfStudent <= 100 ){
			System.out.println("Your grades is A");
		}
		else if (marksOfStudent >= 50 && marksOfStudent < 80){
			System.out.println("Your grade is B");
		}
	   else if (marksOfStudent <50 ){
		System.out.println("Your grade is C");
	    }
		//System.out.println("Do you want to continue?");
		//String choice = scanner.nextLine();
		//if (choice.equalsIgnoreCase("Yes")){
		
	}
		
}
