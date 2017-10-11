import java.util.Scanner;
public class angle {
	public double x;
	public void radi()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("radian of degree:");
		int an=sc.nextInt();
		x=an;
		double e=Math.toRadians(x);
		System.out.println("radian : "+e);
	}
	
	public void tansin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("what to do:1 for tangent,2 for sine and 3 for cosine:\n");
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Calculation of tangent:");
			int b=sc.nextInt();
			int c=sc.nextInt();
			 x=b/c;
			double e=Math.tan(x);
			System.out.println("tangent: "+e);
		}
		else if(a==2)
		{
			System.out.println("Calculation of sine:");	
			int b=sc.nextInt();
			int c=sc.nextInt();
			x=b/c;
			double e=Math.sin(x);
			System.out.println("sine: "+e);
			}
		else
		{
			System.out.println("Calculation of cosine:");
			int b=sc.nextInt();
			int c=sc.nextInt();
			x=b/c;
			double e=Math.cos(x);
			System.out.println("cosine: "+e);
		}
		
	}
  public void angle(int n)
  {
	  if(n==5)
		  radi();
	  else
		  tansin();
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
