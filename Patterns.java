package assignment;
import java.util.*;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		
		int n = t.nextInt();
		
		System.out.println("This will print nXn ");
		for(int j=1; j<=n; j++) {
		for(int i=1; i<=n; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}System.out.println();
	
	System.out.println("This will print left triangle ");
	
	for(int j=1; j<=n; j++) {
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}System.out.println();
	
	System.out.println("This will print pattern 3 ");
	
	for(int j=1; j<=n; j++) {
		for (int k=n*2-3;k>=2*(j-1);k--) {
			System.out.print(" ");
		}
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}System.out.println();
	
	
	
	System.out.println("This will print pattern 4 ");

	for(int j=n; j>=1; j--) {
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}System.out.println();
	
	System.out.println("This will print pattern 5");

	for(int j=n; j>=1; j--) {
		for(int k=n;k>j;k--)
		{
			System.out.print("  ");
		}
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
System.out.println("This will print pattern 6 ");
	
	for(int j=1; j<=n; j++) {
		for (int k=n-1;k>=j;k--) {
			System.out.print(" ");
		}
		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}System.out.println();
	}

	
}
