import java.util.*;
class Converter
{
	public static void main(String args[])
	{
		int num,i,rem,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		num=s.nextInt();
		int temp=num;
		while(num>1)
		{
			rem=num%2;
			System.out.print(rem);
			num=num/2;
		}
		System.out.print(num);
		System.out.println("");
		while(temp>8)
		{
			r=temp%8;
			System.out.print(r);
			temp=temp/8;
		}
		System.out.print(temp);
}
}