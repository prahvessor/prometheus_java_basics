package additional;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Anno {
	public static void main(String[] args) throws FileNotFoundException{

		long start = System.currentTimeMillis();

		Scanner scan = new Scanner(new File("src/additional/text.txt"));
		
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		
		Character[] l1 = new Character[line1.length()];
		Character[] l2 = new Character[line2.length()];
		
		if (line1.length() != line2.length()) {
			System.out.println("not Anno");
			return;
		} else {
			for (int i = 0; i < line1.length(); i++) {
	            l1[i] = line1.charAt(i);
	            l2[i] = line2.charAt(i);
	    	}
		}

		int count = l1.length;

		for (int i = 0; i < l2.length; i++) {
			for (int j = 0; j < l1.length; j++) {
				if (l2[i].equals(l1[j])) {
					l1[j] = null;
					count--;
					continue;
				}	
			}
		}
		long finish = System.currentTimeMillis();

		System.out.println((count != 0) ? "Not Anno" + (finish - start):"Anno!" + (finish - start));						  
	}
}