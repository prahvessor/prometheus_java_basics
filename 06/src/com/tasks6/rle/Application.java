package com.tasks6.rle;

public class Application
{
	public static void main( String[] args )
	{
		if ((args.length == 0) || (args[0] == null) || (args[0].equals(""))) {
			System.out.println("");
			// System.exit(0);
		}else {
			String income = args[0];

			char[] decoding = new char[income.length()];

			char sample;

			//decoding String to char[]
			for (int i = 0; i < income.length(); i++) {
				decoding[i] = income.charAt(i);
				// System.out.print(decoding[i]);
			}
			// System.out.println("\n");

			//new print
			int k = 0;
			sample = decoding[0];
			for (int i = 0; i < decoding.length; i++) {

				int sampleCount = 1;

				while ((i + 1 < decoding.length) && (decoding[i] == decoding[i+1]) && (sampleCount < 9)) {
					sampleCount++;
					i++;
				}
				System.out.print(decoding[i]);
				if (sampleCount > 1) {
					System.out.print(sampleCount);
				}
			}
		}
	}
}      
      