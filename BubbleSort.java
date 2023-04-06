

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		bubbleSort(arr);
		System.out.println("Sorted array is:");
		for (int num: arr) {
			System.out.println(num + " ");
		}
		
	}
	
	// method for bubble sort algorithm 
	public static void bubbleSort(int[] arr) {
		int n = arr.length; 
		boolean swapped; 
		for (int i = 0; i < n; i++) {
			swapped = false;
			for (int j = 0; j < (n-1); j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp; 
					
					swapped = true; 
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}
