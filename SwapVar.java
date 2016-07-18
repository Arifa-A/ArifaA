public class SwapVar {

	public static void main(String[] args) {
		System.out.println("before swapping");
		
		int a=10;
		int b=20;
		int c=30;
		System.out.println("a is"+a+ "b is"+b+"c is"+c);
		int temp=c;
		c=b;
		b=a;
		a=temp;
		System.out.println("after swapping" +"a is"+""+ a +" b is"+ b +"c is "+c);
		
	}

}
