import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
     int d=com(a,b);
      int f=com(d,c);
      System.out.print(f);
	}
   public static int com(int x,int y)
   { int gcd=1;
     for(int i = 1; i <= x && i<=y ; i++)
        {
            // Checks if i is factor of both integers
            if(x%i==0 && y%i==0)
                 gcd=i;
        }
        return(gcd);
   } 
  
}