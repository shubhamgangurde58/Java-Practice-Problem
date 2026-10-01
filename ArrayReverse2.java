class ArrayReverse2{

	public static void main(String args[]){

		int[] array = {10,20,30,40,50,60,70};
		int[] reverse = new int[array.length]; 


		for(int i=0;i<=array.length-1;i++){
			reverse[i] = array[array.length-1-i];
		}

		System.out.println("Array in Reverse :");
		for(int i=0;i<=reverse.length-1;i++){
			System.out.print(reverse[i]+",");
		}

	}
}