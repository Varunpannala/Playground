import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
     int n=s.nextInt();
      int sum=0;
      for(int m=1;m<=n;m++)
      {
        sum=sum+m;
      }
        System.out.println(sum);
	
}
}
