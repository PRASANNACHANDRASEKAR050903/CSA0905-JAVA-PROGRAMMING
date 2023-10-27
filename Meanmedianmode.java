    import java.util.*;    
    class Meanmedianmode
    {
    public static void main(String[] args)
    {    int[] invalue = new int[]{2,4,5,2,6};
    int num_value=5;
	    int a[]= new int[10];
            int n,i;
        Scanner s=new Scanner(System.in);
	System.out.println("Number of elements in an arrary:");
	n=s.nextInt();
	for(i=0;i<n;i++){
		a[i]=s.nextInt();
	}
    double tot=0;
    double mean=0;
    for(i=0; i<n; i++)
    {
    tot = tot+a[i];
    }
    mean = tot/n;
    System.out.println("The mean value is: "+mean);
    double median = 0;
    double mid=0;
    if(n%2 == 0)
    {
    int temp=(n/2)-1;
    for(i=0;i<n;i++)
    {
    if(temp==i || (temp+1)==i)
    {
    mid=mid+a[i];
    }
    }
    mid=mid/2;
    System.out.println("Median value is: "+mid);
    }
    else
    {
    int temp=(n/2);
    for(i=0;i<n;i++)
    {
    if(temp==i)
    {
    mid=a[i];
    System.out.println("Median value: "+mid);
    }
    }
    }
    int j,z, tmp, maxCount, modeValue;
    int[] tally=new int[num_value];
    for(i=0;i<n;i++)
    {
    for(j=0;j<n-i;j++)
    {
    if(j+1!=n)
    {
    if(a[j]>a[j+1])
    {
    tmp=a[j];
    a[j]=a[j+1];
    a[j+1]=tmp;
    }
    }
    }
    }
    for (i = 0; i < n; i++)
    {
    for(z=i+1;z<n;z++)
    {
    if(a[i]==a[z])
    {
    tally[i]++;
    }
    }
    }
    maxCount = 0;
    modeValue = 0;
    for (i = 0; i <n; i++)
    {
    if (tally[i] > maxCount)
    {
    maxCount = tally[i];
    modeValue = a[i];
    }
    }
    System.out.println("Mode value is :"+modeValue);
    }
    }