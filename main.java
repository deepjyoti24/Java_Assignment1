import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int arr[] = new int [12];
		Scanner sc = new Scanner(System.in);
		
		for( i=0; i<arr.length; i++)
		{
			System.out.print("Enter the "+i+"th days:");
			arr[i] = sc.nextInt();		
		}
		

		
		String arr1[] = new String[12];
		System.out.print("Enter the Name of the Month:");
		
		for( i=0; i<arr1.length; i++)
		{
			System.out.println("Enter the Name for "+i+" Element:");
			arr1[i] = sc.next();
			
		}
		
		String str;
		System.out.println("Enter the Month You Want to Know The Days:");
		
		str = sc.next();
		
		for(i=0; i<arr1.length; i++)
		{
			if(str.equals(arr1[i]))
			{
				System.out.print(arr[i]);
			}
		}
		
		
		
		
		
	}

}
