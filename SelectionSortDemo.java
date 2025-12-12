class SelectionSortDemo{

	public static void printDemo(int arr[]){

		System.out.println("\n***After Sorting Array***");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] +" ");
		}

	}

	public static void main(String args[]){

		int arr[]={5,9,8,4,1,2,1};
		
		System.out.println("***Before Sorting Array***");

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] +" ");
		}
		

		for(int i=0;i<arr.length-1;i++){

		int smallest = i;

			for(int j=i+1;j<arr.length;j++){

				if(arr[smallest] > arr[j]){

					smallest = j;

				}
			}

			int temp = arr[smallest];

			arr[smallest] = arr[i];

			arr[i] = temp;
		}

		printDemo(arr);

	}
}