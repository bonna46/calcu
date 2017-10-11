
public class subaddmuldiv extends angle {
   public int b;
   public void add(int y,int z)
   {
	   b=y+z;
   }
   
   public void sub(int y,int z)
   {
	   if(y<z)
		   b=z-y;
	   else
		   b=y-z;
   }
   
   public void mul(int y,int z)
   {
	   b=y*z;
   }
   
   public void div(int y,int z)
   {
	   if(y>z)
		   b=y/z;
	   else
		   b=z/y;
   }
   
   public void subaddmuldiv(int x,int y,int z)
   {
	   if(x==1)
		   add(y,z);
	   else if(x==2)
		   sub(y,z);
	   else if(x==3)
		   mul(y,z);
	   else
		   div(y,z);
	   System.out.println("answer :\n"+b); 
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
