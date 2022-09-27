/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//char i,j;

	/*	for(i='a';i<='z';i++)
		{
		   for(j='a';j<=i;j++)
		   {
		      System.out.print(j);
		   }
		   System.out.println();
		}*/
		
		/*for(i='z';i>='a';i--)
		{
		   for(j='z';j>=i;j--)
		   {
		      System.out.print(j);
		   }
		   System.out.println();
		}*/
      
      int i,j,k;
		/*for(i=1;i<=9;i++)
		{
		   for(j=1;j<=i;j++)
		   {
		      System.out.print(j);
		   }
		   System.out.println();
		}*/
		
    String s;
    System.out.println("Enter the string");
    s=input.nextLine();
    k=s.length();
    
    /*for(i=0;i<k;i++)
    {
        for(j=0;j<k;j++)
        {
        if(i==j||(i+j==k-1))
        System.out.print(s.charAt(j));
        else
       System.out.print(" ");
        }
       System.out.println();
    }
	}*/
	
	 /*for(i=0;i<k;i++)
    {
        System.out.print(s.charAt(i));
    }
    System.out.println();
    k=s.length();
    for(i=k-2;i>=1;i--)
    {
        for(j=1;j<=i;j++)
        {
           System.out.print(" ");
        }
        System.out.print(s.charAt(i)+"\n");
    }
    k=s.length();
    for(i=0;i<k;i++)
    {
        System.out.print(s.charAt(i));
    }*/
    
    /*k=s.length();
    for(i=k-1;i>=0;i--)
    {
            for(j=k-1;j>i;j--)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            for(j=1;j<i*2;j++)
            {
               System.out.print(" ");
            }    
            if(i>=1)
            System.out.print(s.charAt(i));
            System.out.println();
    }*/
    
    /*k=s.length();
    for(i=k-1;i>=0;i--)
    {
            for(j=k-1;j>i;j--)
            {
               System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            for(j=1;j<i*2;j++)
            {
               System.out.print(" ");
            }    
            if(i>=1)
             System.out.print(s.charAt(i));
            System.out.println();
    }
    
    k=s.length();
    for(i=1;i<=k;i++)
    {
        for(j=1;j<=k-1;j++)
        {
            System.out.print(" ");
        }
        System.out.println(s.charAt(i));
    }*/
}
}

