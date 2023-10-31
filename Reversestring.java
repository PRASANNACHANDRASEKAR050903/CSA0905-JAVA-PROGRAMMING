import java.util.*;
class Reversestring{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String x;

		x=s.nextLine();
		int l,i;
		l=x.length();
		for(i=l-1;i>=0;i--)
		{
			System.out.print(x.charAt(i));
		}
}
}