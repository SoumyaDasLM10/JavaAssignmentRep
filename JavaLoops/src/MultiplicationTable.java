import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
			int userNum,userLimit;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your number:");
			userNum = scanner.nextInt();
			System.out.println("Enter the number till which you want to see the multiplication table:");
			userLimit = scanner.nextInt();
			System.out.println("\t:USING WHILE LOOP!!!:");
			System.out.println("The Multiplication Table for "+userNum+" is:");
			int n=1,p=1;
			while(n <= userLimit){
				p = userNum * n;
				System.out.println(userNum+"\tX"+"\t"+n+"\t="+p);
				n++;
			}
			int m=1,q=1;
			System.out.println("\n\n\t:USING FOR LOOP!!!:");
			for(m=1;m<=userLimit;m++){
				q = userNum * m;
				System.out.println(userNum+"\tX"+"\t"+m+"\t="+q);
			}
			
	}

}
