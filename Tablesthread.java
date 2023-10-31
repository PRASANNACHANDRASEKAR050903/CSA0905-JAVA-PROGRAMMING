
class Multiplythread implements Runnable
{
	public void run()
	{
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("Multiplication 13:");
				for(int i=1;i<=5;i++)
		{
			System.out.println(i+"x13="+i*13);
		}
	}
}
class Tablesthread implements Runnable{
	
	public void run()
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Multiplication 17:");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"x17="+i*17);
		}
	}
	public static void main(String arg[])
	{

		Multiplythread  p=new Multiplythread();
	        Thread t1=new Thread(p);
		t1.start();
                Tablesthread  r=new Tablesthread();
	        Thread t2=new Thread(r);
		t2.start();
		
	}
}
