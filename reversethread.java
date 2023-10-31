
class fibothread extends Thread
{
	public void run()
	{
	int n1=0,n2=1,n3;
	setPriority(Thread.MIN_PRIORITY);
	System.out.println("FIBO");
	System.out.println(n1);
	System.out.println(n2);
	for(int i=2;i<=10;i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
	}
	}
}
class reversethread extends Thread{
	
	public void run()
	{
		System.out.println("REVERSE ORDER");
		setPriority(Thread.MAX_PRIORITY);
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String arg[])
	{
		fibothread p=new fibothread();
		reversethread r=new reversethread();
		p.start();
		r.start();
	}
}
