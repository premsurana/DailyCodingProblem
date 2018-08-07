import java.util.Scanner;

class First {

	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("\nEnter size of array : ");
		int n = obj.nextInt();
		
		System.out.print("\nEnter "+n+" array Elements : ");
		int []a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = obj.nextInt();
		}
		
		int []newArray = creatingNewProductArray(a , n);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(newArray[i]);
		}
	}
	
	public static int[] creatingNewProductArray(int []a , int n) {
		
		int sum = 1;
		int []newArray = new int[n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i==j)
					continue;
				
				sum = sum * a[j];
			}
			newArray[i] = sum;
			sum = 1;
		}
		
		return newArray;
	}
}
