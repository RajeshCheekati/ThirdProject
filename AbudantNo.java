public class AbudantNo {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
					int n=21;
					int sum= 0;
					for (int i=1;i<n;i++)
					{
						if(n%i==0) 
							sum= sum+i;	
						
					}
					System.out.println("Sum Is "+sum);
					if(sum>n) 
						System.out.println(n +" is abudant num");
					//System.out.println(sum);
					else
						System.out.println(n+" not abudant");
		
	}

}