import java.util.Scanner;
class InsertionSortDemo{

	public static void printArray(int arr[]){

		System.out.println("-After sorting-");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");

		}

	}

	public static void main(String args[]){

		System.out.println("***Insertion Sorting***");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element:");

		for(int i=0;i<arr.length;i++){

			arr[i]= sc.nextInt();

		}

		for(int i=0;i<arr.length;i++){

			int current = arr[i];

			int j = i-1;

			while(j>=0 && current < arr[j]){

				arr[j+1] = arr[j]; 

				j--;
			}

			arr[j+1] = current;

		}

		printArray(arr);
	}
}