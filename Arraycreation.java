package basic;
import java.util.Scanner;
public class Arraycreation {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		;
		System.out.print("\n");
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[6];
		System.out.println("enter the elements");
		for (int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
