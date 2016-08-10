public class ReverseString
{
public static void main(String[] args){
Scanner inp=new Scanner(System.in);
System.out.println("enter the string);
String str=inp.nextLine();
Sting rev=new StringBuffer(str).reverse().toString();
System.out.println(rev);
}
