import java.util.Scanner;

public class QExit {
	public static void main(String[] args){
Scanner scr=new Scanner(System.in);
String s=scr.next();
 if(s.charAt(0)=='q'|| s.charAt(0)=='Q')
 {	System.out.println("exitted");
	 System.exit(0);
}
else{
	System.out.println("not exit ");
}
}
}
