
public class Bubble_Sort {

	public static void Bubblesort(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length -1; j++) {
			if(arr[j]<arr[i]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = {5,4,3,2,1};
	        System.out.print("Before Sorting: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(" " + arr[i]);
	        }
	        Bubblesort(arr);
	        System.out.print("\nAfter sorting: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(" " + arr[i]);
	        }

	}

}
