class BubbleSortDemo2{

	public static void printArray(int arr[]){

		System.out.println("---After sorting array---");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] +" ");

		}

	}

	public static void main(String args[]){

		int arr[]={58,60,12,42,78,11,1,5,4};

		for(int i=0;i<arr.length-1;i++){

			for(int j=0;j<arr.length-i-1;j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j];

					arr[j] = arr[j+1];

					arr[j+1] = temp;

				}

			}

		}

		printArray(arr);


	}
}