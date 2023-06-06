package Testlogics;

public class Seven {

	public static void main(String[] args) {


		int arr[] = { 45, 58, 69, 15, 85, 47, 55, 63, 54, 78, 98 }; 
		for(int i = 0; i<=10;i++)
		{
			if(arr[i]%5==0)
			{
				
				arr[i] = 5;
				
			}
			
		}
		
		for(int i = 0; i<=10;i++)
		{
			
			System.out.println(arr[i]);
		}
		}
	}


