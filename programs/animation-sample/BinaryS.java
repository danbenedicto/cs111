class BinaryS{
	public static void main(String[] args){
		int i,j;
		String[] inputArray = {"Elephant","Dog","Cat","Bigfoot","Bird","Alpaca","Buffalo","Rhinosaur","Dogzilla","Beagle","Termite","Hamster","Penguin"};
		for (j = 1; j < inputArray.length; j++) { 
			String key = inputArray[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray[i]) > 0) {
					break;
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = key;
		}

		System.out.println("The sorted list is:");
		
		for(int k = 0; k <inputArray.length; k ++){
			System.out.print(inputArray[k] +" ");		
		}	


		//use IO.readString() here
		String search = "Bigfoot";

		System.out.println("\n\nSearching for " + search);

		//this is a non-recursive implementation, but if they covered that feel free to use it

		int low = 0;
		int high = inputArray.length - 1;
		int indexS = -1;
		while (low <= high) {
			int mid = (low + high)/2;
			if (inputArray[mid].equals(search)){
				indexS = mid;
				break;
			}else if (inputArray[mid].compareTo(search)<0) low = mid + 1;
			else high = mid - 1;
		}
				
		System.out.println("search term "+search+" found at " + indexS);
	}
}
