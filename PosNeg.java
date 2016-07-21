import java.util.Scanner;


public class PosNeg {
public static void main(String[] args){
Scanner scr=new Scanner(System.in);
	System.out.println("enter the numbers:");
	int num=scr.nextInt();
	if(num==0){
		System.out.println("the number is zero");
	}
		else if(num%2== 0){
			System.out.println("the given number is positive");
		}
		else{
			System.out.println("the given number is negative");
	}
}
}
