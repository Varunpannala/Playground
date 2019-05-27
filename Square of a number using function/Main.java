import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      square(a);
    }
   public static void square(int s)
   { int c=s*s;
    	System.out.println(c);

}
}