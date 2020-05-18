public class DuplicateElements{
	


	public static void main(String[] args) {

		int[] arr={4,5,20,30,6,20,1,7,30,9};
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length;  j++) {
			if(arr[i]==arr[j])
				System.out.println(arr[j]);
			}
		}

		
		
	}
}