/*package com.project;

public class AlphabetsConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vrphwklqj";
		char arr[] = str.toCharArray();
		System.out.println("Arr is : "+arr);
		int a= 0;
		
		System.out.println("The String before conversion : "+str);
		
		for(int j=0;j<str.length();j++)
		{
			a = arr[j]+3;
			
			System.out.println("a is : "+a);
			arr[j]=(char)a;
			System.out.println("Arr is : "+arr);
		}
		
		System.out.println("The converted String is : "+arr);
		
		char a = 'a';
		int b= a+3;
		char c = a+3; 
		System.out.println(b+" and "+c);
		
		
	}

}

//Accepting the input
//storing into the collection
//finding the asci of enterred data
//converting the found asci to chars
//displaying the newly generated chars*/