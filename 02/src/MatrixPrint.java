public class MatrixPrint {
	public static void main(String args[]){
		for (int i = 1; i <=25; i++) {
			switch (i) {
				case 1:
				case 5:
				case 7:
				case 9:
				case 13:
				case 17:
				case 19:
				case 21:
				case 25:
					System.out.print(" * ");
					break;
				default:
					System.out.printf("%2d ", i);
			}
			if ((i % 5) == 0) {
				System.out.print("\n");
			}
		}
	}
}
   