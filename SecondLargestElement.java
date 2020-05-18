public class SecondLargestElement {
	

	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		int largest=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]>arr[i]){
					largest=arr[j];
						if(largest<arr[j])
							System.out.println("Second largest element: "+arr[j]);
							break;

				}
				}
					
			}
			/*
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(largest<arr[j])
					System.out.println("Second largest element: "+arr[j]);
					break;
					
					
					
			}
			
		}*/
	}

}