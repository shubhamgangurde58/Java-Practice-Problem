class RecursionQuestion11{
	
	public static boolean isSorted(int arr[],int index){

		if(index == arr.length-1){
	
			return true;
		}
	
		if(arr[index] < arr[index+1]){

			System.out.println("call");
			return isSorted(arr,index+1);	

		}else{
			System.out.println("stop");
			return false;	
		}

		

	
	}

	public static void main(String args[]){

		int arr[]={1,2,3,4,5,7};

		System.out.println(isSorted(arr,0));
		
	}
}