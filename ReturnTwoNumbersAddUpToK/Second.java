import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Second {

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
		
		Collections.sort(arr);
		if(twoNumbersAddUpToK(arr , k)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static boolean twoNumbersAddUpToK(ArrayList <Integer> arr , int k) {
		int first = 0;
		int last = arr.size() -1;
		
		while(first < last) {
		
			if(arr.get(first) + arr.get(last) == k) {
				return true;
			}
			else if(arr.get(first) + arr.get(last) < k) {
				first++;
			}
			else
				last--;
		}
		return false;
	}
}
