import java.util.Scanner;
public class RemoveElement{
	


	public static void main(String[] args) {
		
				int[] arr={4,5,2,6,1,7,3,9};
				int n,j=0;
				System.out.println("Array is: ");
				for (int i=0; i<arr.length; i++) {

					System.out.println(arr[i]);
				}
				System.out.println("Enter the element to be deleted: ");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();

				for (int i=0; i<arr.length; i++) {
					if(arr[i]==n)
						{
							for(j=i; j<arr.length; j++)
							{
								arr[j]=arr[j+1];
							}
							break;
						}
						else{
							System.out.println("Element not found");

						}
					
				}
				for (int i=0; i<arr.length; i++) {

					System.out.println(arr[i]);
				}


			
			}
}