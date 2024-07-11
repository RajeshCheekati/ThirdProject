public class FirstSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[20];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of Array..");
		int n=sc.nextInt();
		System.out.println("Enter a Array Element :");
		for (int i = 0; i < n; i++) 
			a[i]=sc.nextInt();
		int L=a[0],SL=a[1];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>L) {
				SL=L;
				L=a[i];
			}
			else if(a[i]>SL){
				SL=a[i];
			}
		}
			System.out.println("Largest Element :"+L);
			System.out.println("SecondLargest Element :"+SL);
		

	}

}