package AssignmentArrayBasic3;

public class CopyArray {

	
	public static void main(String[] args) {
		int arr1[] = {2, 6, 7, 1, 9, 3, 8};
		
		int [] arr2 = new int[arr1.length];
		
		for(int i = 0, j = 0; i < arr1.length; i++, j++) {
			
			arr2[j] = arr1[i];
		}
		//System.out.print("Array is : "+arr2);
		System.out.print("Copy Array: ");  
        for (int num : arr2) {  
            System.out.print(num + " ");  
        } 
	}
}
