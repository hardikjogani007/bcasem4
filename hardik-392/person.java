abstract class person
{
	void show()
	{
		System.out.println("show");
	}
}
class sub extends person{}
class abs
{
	public static void main(String[] args)
	{
		person sub=new sub();
		sub.show();	
	}
}