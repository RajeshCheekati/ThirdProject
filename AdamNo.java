public class AdamNo {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int sq1 = n * n;
			int rev1 = 0;
			while (n > 0) {
				int rem1 = n % 10;
				rev1 = rev1 * 10 + rem1;
				n = n / 10;
			}
			int sq2 = rev1 * rev1;
			int rev2 = 0;
			while (sq2 > 0) {
				int rem2 = sq2 % 10;
				rev2 = rev2 * 10 + rem2;
				sq2 = sq2 / 10;

			}
			if (rev2 == sq1)
				System.out.println("adam no");
			else
				System.out.println("not adam no");

	}

}