import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int sum = 0;
		int num = n;
		int count=0;
		int remainder = 0;
		while(num!=0){
			count++;
			num = num/10;
		}
		num = n;
		while(num!=0){
			remainder = num%10;
			sum+=Math.pow(remainder, count);
			num = num/10;
		}
		if(sum==n){
			System.out.println(n + " is an armstrong number");
		}
		else 
			System.out.println(n + " is not an armstrong number");
	}
}
