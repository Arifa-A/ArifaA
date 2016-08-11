import java.util.Scanner;
public class SumofNumber {
	public static void main(String[] args){
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=scr.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++){
			sum+=i;
			}
		System.out.println(sum);
	}

}
