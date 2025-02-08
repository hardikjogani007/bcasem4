using System;
class boxing
{
	public static void Main()
	{
		//int a=10;
		//object x=a;//boxing (implicit)
		object obj=100;
		int a=(int)obj;//unboxing (explicit)
		//Console.WriteLine("value of a:"+a);
		//Console.WriteLine("value of x using object:"+x);
		Console.WriteLine("value of object:"+obj);
		Console.WriteLine("value of a:"+a);
		Console.Read();
	}
}