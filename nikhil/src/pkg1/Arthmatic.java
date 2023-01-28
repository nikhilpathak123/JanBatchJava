package pkg1;

public class Arthmatic 
{
	public int sum(int a, int b)
	{
	int c = a+b;
	System.out.println("sum result of" +c);
	return c;
}
	public int sum1(int a1, int b1)
	{
	int r = a1+b1;
	System.out.println("sum result of" +r);
	return r;
}
	public int sub(int a2, int b2)
	{
	int p = a2-b2;
	System.out.println("sub result of" +p);
	return p;
}
	public int multi(int a3, int b3)
	{
	int s = a3*b3;
	System.out.println("multi result of" +s);
	return s;
}
	public int div(int a4, int b4)
	{
	int t = a4/b4;
	System.out.println("div result of" +t);
	System.out.println("final result of (((((10+2)+2)-2)*2)/2)=+t");
}
public static void main(String[] args) 
{
	Arthmatic obj=new Arthmatic();
	int sumresult=obj.sum(10,2);
	int result=obj.sum(sumresult,2);
	int subresult=obj.sub(result,2);
	int multiresult=obj.multi(subresult,2);
	int divresult=obj.div(multiresult,2);
}
}
