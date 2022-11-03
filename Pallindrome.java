package labexamples;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int rev=0,n,tmp,rem;
		System.out.println("Enter a number :");
		n=s.nextInt();
		tmp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			if(tmp==rev)
				System.out.println("The given number"+tmp+" is a pallindrome");
			else
				System.out.println("The given number "+tmp+" is not a pallimdrome");
			s.close();
		}
		

	}

}
