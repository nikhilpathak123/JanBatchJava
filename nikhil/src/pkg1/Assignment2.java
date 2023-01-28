package pkg1;

public class Assignment2 
{
	public int div(int a, int b)
	{
	int c=a/b;
	System.out.println("div result of" +c);
	return c;
	}

	public int sub(int a1, int b1)
	{
	int r = a1-b1;
	System.out.println("sub result of" +r);
	return r;
}
	public int sum(int a2, int b2)
	{
	int p = a2+b2;
	System.out.println("sum result of" +p);
	return p;
}
	public int sub1(int a3, int b3)
	{
		int s=a3-b3;
		System.out.println("sub1 result of" +s);
	return s;
}
	public int multi(int a4, int b4)
	{
	int t = a4*b4;
	System.out.println("multi result of" +t);
	System.out.println("final result of (((((10/2)-2)+2)-2)*2= +t");
	return t;
}
public static void main(String[] args) 
{
	Assignment2 obj=new Assignment2();
	int divresult=obj.div(10,2);
	int subresult=obj.sub(divresult,2);
	int sumresult=obj.sum(subresult,2);
	int subresult1=obj.sub(sumresult,2);
	int multiresult=obj.multi(subresult1,2);

}
}
