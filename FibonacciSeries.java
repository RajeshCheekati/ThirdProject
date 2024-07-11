public class FibonacciSeries {
	
public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Limit :");
			int n=sc.nextInt();
			int f=0;
			int s=1;
			int next;
			System.out.println("Fibonacci Series is "+f+" "+s);
			for(int i=1;i<=n;i++) {
				next=f+s;
				 f=s;
			     s=next;
			System.out.print(" "+next+" ");
	     		
		}

	}

}
