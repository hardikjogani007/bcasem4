class nopro
{
	static void check()
	{
		System.out.println("non static");
	}
	public static void main(String [] args)
	{
		pro obj=new pro();
		obj.check();
		System.out.println("my first java program");
	}
}
