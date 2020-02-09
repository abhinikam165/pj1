package com.project;

public class AlphabetsConversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Vrphwklqj phdqlqjixo");
		//StringBuilder str = new StringBuilder("Uxeb");
		//str.append(" phdqlqjixo");
		
		
		System.out.println("The String before conversion : "+str);
		
		for(int j=0;j<str.length();j++)
		{
			char c = str.charAt(j);
			int i;
			
			i = c-3;
			
			str.setCharAt(j, (char)i);
		}
		System.out.println("The string after conversion is :"+str);
	}

}

//Accepting the input
//storing into the collection
//finding the asci of enterred data
//converting the found asci to chars
//displaying the newly generated chars