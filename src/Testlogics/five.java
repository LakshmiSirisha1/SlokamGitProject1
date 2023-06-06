package Testlogics;

public class five {
	
	public static void main(String[] args) {
		
		
		/*
		 * int arr[] = { 45, 58, 69, 74, 85, 47, 59, 63, 54, 78, 98 }; 
		 * for(int i =0; i<=10;i++) {
		 * 
		 * if(i%2==0)
		 * 
		 * { System.out.println(arr[i]);
		 * 
		 * } }
		 */
		
		
		/*
		 * int arr[] = { 45, 58, 69, 74, 85, 47, 59, 63, 54, 78, 98 }; 
		 * for(int i =0; i<=10;i++) {
		 * 
		 * if(i%2==0 && arr[i]%2==0)
		 * 
		 * { System.out.println(arr[i]);
		 * 
		 * } }
		 */
		
		int arr[] = { 45, 58, 69, 74, 85, 47, 59, 63, 54, 78, 98 };
		for(int i =0; i<=10;i++)
		{
			
			if(i%2==0 || arr[i]%2==0)

			{
				System.out.println(arr[i]);
				
			}
		}
		
	}

}
