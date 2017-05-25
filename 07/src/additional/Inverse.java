package additional;

import java.util.Scanner;
public class Inverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String in = scan.nextLine();
		Character[] chars = new Character[in.length()];

		for (int i = 0; i < in.length(); i++) {
	            chars[i] = in.charAt(i);
	        }


		for (int i = chars.length - 1; i >= 0 ; i--) {
			System.out.print(chars[i]);
		}
	}
}