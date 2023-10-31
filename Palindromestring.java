import java.util.*;
class Palindromestring{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String x,y="";
		

		x=s.nextLine();
		int l,i;
		l=x.length();
		for(i=l-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		if(x.equals(y))
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println(" not palindrome");}

}
}