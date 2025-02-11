class demoofliterals    
{
	public static void main(String[] args)
	{
		//integer literals
		int decimalLiterals=100;//decimal
		int binaryLiterals=0b1100100;//binary prefix (0,b)
		int octalLiterals=0144; //octal (prifix 0)
		int hexaLiterals=0x64; //hexadecimal (prefix 0,a)
		
		//floating Literals
		float floatLiteral=2.718f; //floatliterals
		
		//Character Literals
		char CharLiteral='A';
		
		//string Literals
		String StringLiteral="Hello world!!";
		
		//Boolean literals
		Boolean trueLiteral=true;
		Boolean falseLiteral=false;
		
		//NUll Literals (for object)
		String nullLitereal=null;
		
		System.out.println("Literals........................");
		
		System.out.println("Decimalliterals="+decimalLiterals);
		System.out.println("Binaryliterals="+binaryLiterals);
		System.out.println("octalliterals="+octalLiterals);
		System.out.println("hexadecimalliterals="+hexaLiterals);
		
		System.out.println("floatLiteral="+floatLiteral); //float
		
		System.out.println("charliteral="+CharLiteral); //char
		System.out.println("stringliteral="+StringLiteral);
		
		System.out.println("Boolean true literals="+trueLiteral);
		System.out.println("Boolean false literals="+falseLiteral);
		
		System.out.println("Nullliteral="+nullLitereal);
	}
}