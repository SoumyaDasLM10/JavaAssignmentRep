import java.util.*;
public class MaxAndMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = scanner.nextInt();
		int c,max,min;
		int arr[] = new int[size];
		System.out.println("Enter the numbers in the array");
		for(c=0;c<size;c++){
			arr[c] = scanner.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for(c=0;c<size;c++){
			
			if(arr[c]>max){
				max = arr[c];
			}
		}
		System.out.println("The maximum number is: "+max);
		for(c=0;c<size;c++){
			if(arr[c]<min){
				min = arr[c];
			}
		}
		System.out.println("The minimum number is: "+min);
	}

}
