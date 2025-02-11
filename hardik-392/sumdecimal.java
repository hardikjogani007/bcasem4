class sumdecimal    
{
	public static void main(String[] args)
	{
		//integer literals
		int decimalLiterals=100;//decimal
		int decimalLiteral=101;
		
		int binaryLiterals=0b1100100; //binary prefix (0,b)
		int binaryLiteral=0b1100100;
		
		int octalLiterals=0144; //octal (prifix 0)
		int octalLiteral=0122;
		
		int hexaLiterals=0x64; //hexadecimal (prefix 0,a)
		int hexaLiteral=0x65;
		
		System.out.println("Decimal...........");
		System.out.println("1.Decimalliterals addition="+(decimalLiterals+decimalLiteral));
		System.out.println("2.Decimalliterals substration="+(decimalLiterals-decimalLiteral));
		System.out.println("3.Decimalliterals multiphication="+(decimalLiterals*decimalLiteral));
		System.out.println("4.Decimalliterals division="+(decimalLiterals/decimalLiteral));
		System.out.println("\n");
		
		System.out.println("binary...........");
		System.out.println("1.Binaryliterals addition="+(binaryLiterals+binaryLiteral));
		System.out.println("2.Binaryliterals substration="+(binaryLiterals-binaryLiteral));
		System.out.println("3.Binaryliterals multiphication="+(binaryLiterals*binaryLiteral));
		System.out.println("4.Binaryliterals division="+(binaryLiterals/binaryLiteral));
		System.out.println("\n");
		
		System.out.println("octal...........");
		System.out.println("1.octalliterals addition="+(octalLiterals+octalLiteral));
		System.out.println("2.octalliterals substration="+(octalLiterals-octalLiteral));
		System.out.println("3.octalliterals multiphication="+(octalLiterals*octalLiteral));
		System.out.println("4.octalliterals division="+(octalLiterals/octalLiteral));
		System.out.println("\n");
		
		System.out.println("hexadecimal...........");
		System.out.println("1.hexadecimalliterals addition="+(hexaLiterals+hexaLiteral));
		System.out.println("2.hexadecimalliterals substration="+(hexaLiterals-hexaLiteral));
		System.out.println("3.hexadecimalliterals multiphication="+(hexaLiterals*hexaLiteral));
		System.out.println("4.hexadecimalliterals division="+(hexaLiterals/hexaLiteral));
	}
}