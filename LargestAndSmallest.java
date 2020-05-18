public class LargestAndSmallest{
	


	public static void main(String[] args) {

		int[] arr={4,5,2,6,1,7,3,9};
		int large,small;
		large=arr[0];
		small=arr[0];
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>large)
				large=arr[i];
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("Largest : "+large);
		System.out.println("Smallest : "+small);
		
		
	}
}