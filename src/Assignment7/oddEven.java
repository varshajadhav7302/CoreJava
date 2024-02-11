package Assignment7;

public class oddEven {
	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3, 4, 5, 6, 7};
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i <= arr1.length; i++) {
			 
			if(i%2 == 0) {
				
				even += i;	
				
			}
			else if(i%2 != 0) {
				odd += i;
				
			}
			
		}
		System.out.println("Even Number is : "+even);
		System.out.println("Odd Number is : "+odd);
	}

}
