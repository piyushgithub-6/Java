import java.util.*;
class DoSum
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		System.out.println("Enter no. of elements you want in array:");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array:");
		for(i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Elements of array are:");
		for(i=0; i<n; i++)
		{
			System.out.println(arr[i]+"   ");
		}
		System.out.println();
	}
}	