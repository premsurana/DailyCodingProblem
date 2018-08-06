import java.util.ArrayList;
import java.util.Scanner;

class First {

	public static void main(String []args) {
	
		ArrayList <Integer>arr = new ArrayList <Integer>();
		int n;
		
		Scanner obj = new Scanner(System.in);
		System.out.print("\nEnter n : ");
		n = obj.nextInt();
		
		System.out.print("\nEnter "+n+" Numbers : ");
		for(int i = 0 ; i < n ; i++) {
			
			arr.add(obj.nextInt());
		}
		
		System.out.print("\nEnter K : ");
		int k = obj.nextInt();
		if(twoNumbersAddUpToK(arr , k)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static boolean twoNumbersAddUpToK(ArrayList <Integer> arr , int k) {
		for(int i = 0 ; i < arr.size() ; i++) {
			
			for(int j = i+1 ; j < arr.size() ; j++) {
				if(arr.get(i)+arr.get(j) == k) {
					return true;
				}
			}
		}
		return false;
	}
}
