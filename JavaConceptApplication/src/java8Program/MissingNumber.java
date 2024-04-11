package java8Program;

public class MissingNumber {

	private static void getMissingNo(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int num = arr[0];
		
		for(int i = 0 ; i< n ; i++) {
			
			if(num != arr[i]) {
	            
				System.out.println("First missing number in sequence: " + num);
				break;
			}
			System.out.println(arr[i]);
			num++;
		  
		}
		
		// return ((n * (n+1))/2 - num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 5  };
        int N = arr.length;
       getMissingNo(arr, N);
	}

	

}
