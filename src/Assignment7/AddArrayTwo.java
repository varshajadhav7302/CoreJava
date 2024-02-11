package Assignment7;

import java.util.Arrays;

public class AddArrayTwo {
	
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4,5,6,7};
		
		int [] arr2 = {0,0,2,1,3,5,6};
		
		int [] arr3 = new int[arr1.length];
		
		for(int i =0, j=0, k=0; i < arr1.length; i++, j++, k++) {
			
			arr3[k] = arr1[i] + arr2[j];
			
		}
		
		System.out.print("Sum Array: ");  
        for (int num : arr3) {  
            System.out.print(num + " ");  
        }  
	}

}
