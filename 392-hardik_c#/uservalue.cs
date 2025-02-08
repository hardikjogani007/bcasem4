using System;

class Program
{
    static void Main()
    {
		Console.Write("Enter a Name: ");
		string username= Console.ReadLine(); 
        Console.Write("Enter a value: ");
        int uservalue= Convert.ToInt32(Console.ReadLine());
		Console.WriteLine("\n");
        Console.WriteLine("You entered value: " + uservalue);
		Console.WriteLine("You entered name: " + username);
    }
}