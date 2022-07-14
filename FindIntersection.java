package week1.day2;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr1={3,2,11,4,6,7,9,10,1};
		int[] arr2={1,10,2,8,9,7,0};

		System.out.println("The intersection of array1 and array2 is as follows:");		
		for (int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if (arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
