public class CommonInArrays{
	


	public static void main(String[] args) {
		
		int[] arr1={5,6,1,7,9};
		int[] arr2={3,6,12,9,40,32,5};

		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr2.length; j++) {

				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			
			}
			
		}
	}
}