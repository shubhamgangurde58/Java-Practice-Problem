
class BubbleSortDemo{
	
	public static void printArray(int arr[]){

	System.out.println("\nAfter Sorted Array:");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] + " ");
		}

	}
	
	public static void main(String args[]){

		System.out.println("***Bubble Sort***");

		int arr[]={7,8,3,1,2};
		System.out.println("Before Sorted Array:");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] + " ");
		}

		//Outer loop
		for(int i=0;i<arr.length-1;i++){

			//inner loop
			for(int j=0;j<arr.length-i-1;j++){

				if(arr[j]>arr[j+1]){

					int temp = arr[j];

					arr[j] = arr[j+1];
	
					arr[j+1] = temp;
				}
				
			}

		}
		printArray(arr);
	}
}