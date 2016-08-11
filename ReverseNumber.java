public class REverseNumber {
	public static void main(String[] args){
		Scanner scr=new Scanner(System.in);
	int num = scr.nextInt();
for(int i=0;num!=0;i++){
			
	int revnum=0;
	revnum=revnum*10;
	revnum=revnum+num%10;
			num=num/10;
			System.out.print(revnum);
		}
	}
}
