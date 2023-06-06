package Testlogics;

public class two {

	public static void main(String[] args) {
//Storing even numbers from 0 into an array
		
		int a[ ] = new int[5];
		int even = 0;
		
		for(int i =0; i<=a.length-1;i++)
		{
			a[i] = even;
			even = even +2;
			System.out.println(even);
			
		}
	}

	
	
}
