/*Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.*/

import java.util.Scanner;

class First {

	public static void main(String []args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("\nEnter Message : ");
		String in = obj.nextLine();
		if(in.contains('0')) {
			System.out.print("\nNot Possible to decode");
			return;
		}
		
		for(int i = 0 ; i < in.length() ; i++) {
		
			
		}
	}
}
