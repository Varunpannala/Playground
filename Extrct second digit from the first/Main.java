import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      int f;
      while(n>=100)
      {
        n=n/10;
        
      }
      f=n%10;
      System.out.println(f);
	}
}