public class Selection_sort {	
	public static void Selectionsort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
				if(min != i) {
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		  int arr[] = {5,4,3,2,1};
	        System.out.print("Before Sorting: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(" " + arr[i]);
	        }
	        Selectionsort(arr);
	        System.out.print("\nAfter sorting: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(" " + arr[i]);
	        }
	}

}
