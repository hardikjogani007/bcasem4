using System;
namespace array
{
	class array
	{
		public static void Main()
		{
			Console.Write("enter index:");
			int r=Convert.ToInt32(Console.ReadLine());
			int []ar=new int[r];
			for(int i=0;i<ar.Length;i++)
			{
				Console.Write("enter value:");
				ar[i]=Convert.ToInt32(Console.ReadLine());
			}
			for(int i=0;i<ar.Length;i++)
			{
				Console.WriteLine("value of:[{0}]={1}",i,ar[i]);
			}
		}
	}
}