public static void main(String[] args){
System.out.println("enter the value");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int fact=1;
for(int i=0;i<=n;i++){
fact=fact*i;
}
Sysstem.out.println(fact);
}
