public class StrongNo {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a limit :");
			int n=sc.nextInt();
			int ono=n;
			int sum=0;
			while(n>0) {
				int rem=n%10;
				int fact=1;
				for(int i=rem;i>0;i--) 
					fact=fact*i;
					sum=sum+fact;
					n=n/10;
				
			}
				if(ono==sum)
					System.out.println(ono+" Strong number");
				else
					System.out.println(ono+" Not a Strong number");
		}

}
