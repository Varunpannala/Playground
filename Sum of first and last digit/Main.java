import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l = n%10;
      int f,s;
      while(n>=10)
      {
        n=n/10;
      }
      f=n;
      s=f+l;
      System.out.println(s);
	}
}