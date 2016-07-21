import java.util.Scanner;


public class EvenOdd {
public void main(String[] args){
	Scanner scr=new Scanner(System.in);
	System.out.println("enter the values:");
	int n=scr.nextInt();
	if(n%2==0){
		System.out.println("the given number is even");
	}
	else{
		System.out.println("the given number is odd");
	}
}
}
