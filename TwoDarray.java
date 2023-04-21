package basic;
import java.util.Scanner;
public class TwoDarray {

	public static void main(String[] args) {
		int a[][]={{2,3,4},{4,5,6},{7,8,9}};
		for (int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows");
		int r=sc.nextInt();
		System.out.println("enter no.of columns");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("enter the 9 elements");
		for (int i=0; i<r; i++ ) {
			for (int j=0; j<c; j++) {
				arr[i][j]=sc.nextInt();
			
			}
			//System.out.println();
		}
		for (int i=0; i<r; i++ ) {
			for (int j=0; j<c; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
			
	}

}
