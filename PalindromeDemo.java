class PalindromeDemo{

	public static void main(String args[]){
	
		String name = "nayan";
		String newName ="";

		for(int i = name.length()-1 ; i >= 0; i--){

			newName += name.charAt(i);
		}

		if(name.equals(newName)){
			System.out.println("String is Palindrome");
		}else{
			System.out.println("String is Not Palindrome");
		}

	}

}