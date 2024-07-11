public class Addition_2D {

	public static void main (String[] args)	{
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[10][10];
		
		int n,i,j,row,col,sum=0;
		System.out.println("Enter the size of 2D-A a :");
		row=sc.nextInt();
		col=sc.nextInt();
		System.out.println("Enter a  2D-A  elements  in a :");
		for(i=0;i<row;i++)
		{
		for(j=0;j<col;j++)
		{
		a[i][j]=sc.nextInt();
		}
		}
	     for(i=0;i<row;i++) {
	    	 for(j=0;j<col;j++) {
	    		sum=sum+a[i][j]; 
	    		 
	    	 }
		
	     }
	     System.out.println("Sum of 2D-A :"+sum);
		}


}
