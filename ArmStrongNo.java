public class ArmStrongNo {
	

		public static void main(String[] args) {
			int num;   
			Scanner sc= new Scanner(System.in);  
			System.out.print("Enter the limit: ");  
			
			num=sc.nextInt();  
			System.out.println("Armstrong Number up to "+ num + " are: ");  
			for(int i=0; i<=num; i++)  {
				int temp, digits=0, last=0, sum=0;   
				
				temp=i; 
				
					  
				//	System.out.print(i+ ", "); 
				
				while(temp>0)    
				{   
				temp = temp/10;   
				digits++;   
				}   
				temp = i;   
				while(temp>0)   
				{   

	     
				last = temp % 10;   
				
				sum +=  (Math.pow(last, digits));   
				 
				temp = temp/10;   
				}  
				
				if(i==sum)   
				 
				System.out.println(i+" Armstrong no ");    
				
			 // else 
					
				//System.out.println(i+" Not a Armstrong no ");    
				}   	
				
			}

}
