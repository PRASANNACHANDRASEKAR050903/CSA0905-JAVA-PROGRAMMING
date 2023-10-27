import java.util.*;
class Threepower
{
	public static void main(String args[])
	{
		int num,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		num=s.nextInt();
		while(i<=3)
		{
			num=num/3;
			i++;
		}
		if(num%3==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
}
}