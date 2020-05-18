public class ReverseArray{
	


	public static void main(String[] args) {
		
				int[] arr={4,5,2,6,1,7,3,9};
				int i=0,j=7;
				for (int a=0; a<arr.length; a++) {
					while(i<j)
						{
							int temp;
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							i++;
							j--; 

						}
				}
				for (int a=0; a<arr.length ; a++) {
					System.out.println(arr[a]);		
				}
			
			}
}