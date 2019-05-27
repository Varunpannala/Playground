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
   public static void square(int m)
   { float c=((m)*(m+1))/2;
    	System.out.println(c);

}
}