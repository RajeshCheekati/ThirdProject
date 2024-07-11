public class FactOfPrime {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=n;i>0;i--) {
			fact=fact*i;
		System.out.println(fact);
		
		boolean isprime=true;
			for(int j=2;j<=n/2;j++) {
			
			if(n%j==0)
				isprime=false;
			break;
			
		}
			
			

	    if (fact==n) {
			System.out.println(fact+ " is a prime number");
		}
			else {
			System.out.println(fact+" is not a prime number");
		}
		}	

	}

}
