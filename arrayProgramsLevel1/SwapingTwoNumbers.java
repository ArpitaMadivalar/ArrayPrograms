package arrayProgramsLevel1;

import java.util.Scanner;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println("before swaping "+x+"  "+y);
		int  temp=x;
		       x=y;
		     y=temp;
		System.out.println("After swaping "+x+"  "+y);
		     
	}

}
