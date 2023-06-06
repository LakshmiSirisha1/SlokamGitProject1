package Testlogics;

public class Three {

	public static void main(String[] args) {

		int arr[] = { 45, 58, 69, 74, 85, 47, 59, 63, 54, 78, 98 };

		int count = 0;
		for (int i = 0; i <= 10; i++) {

			if (arr[i] >= 60) {

				count = count + 1;

			}

		}

		System.out.println(count);
	}

}
