public class Quick_Sort {
    
    public static void Quicksort(int arr[], int low, int high) {
    	if(low < high) {
    		int mid = low + (high - low) / 2;
    		int pivot = arr[mid];
    		int i = low;
    		int j = high;
    		
    		while (i <= j) {
    			while(arr[i] < pivot) {
    				i++;
    			}
    			while(arr[j]>pivot) {
    				j--;
    			}
    			if(i<=j) {
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    				i++;
    				j--;
    			}
    		}
    		if(low < j) {
    			Quicksort(arr,low,j);
    		}
    		if(i < high) {
    			Quicksort(arr,i,high);
    		}
    	}
    }

    public static void main(String[] args) {

        int arr[] = {5,4,3,2,1};
        System.out.print("Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        Quicksort(arr, 0, arr.length - 1);
        System.out.print("\nAfter sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
