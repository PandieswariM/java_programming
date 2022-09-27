/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int i,sum=0,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=input.nextInt();
		int a[]=new int[n];
		/*for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();   //sum of array
			sum=sum+a[i];
		}*/
		
		/*for(int temp:a)
		{
		   sum+=temp;           //for.....each iteration
		}*/
		//System.out.println("Sum of the array="+sum);
		
		//double avg=((double)sum/(double)a.length);      //implicity converation
		//System.out.println(avg);
		//System.out.println("Average ="+(sum/a.length));     //explicity converation
		
	/*	System.out.println("duplicate value");
		
		for(i = 0; i < a.length; i++) 
		{  
            for(j = i + 1; j < a.length; j++) 
            {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);
            }
		}*/  
		
		///////////////Array Ascending order///////////////////
		Scanner in = new Scanner(System.in);
		String temp;
		String s[]=new String[n];
		for(i=0;i<n;i++)
		{
		   s[i]=in.nextLine();
		}
		for(i=0;i<n;i++)
		{
		   for(j=i+1;i<n;i++)
		   {
		      if(s[i].compareTo(s[j])>0)
		      {
		         temp=s[i];
		         s[i]=s[j];
		         s[j]=temp;
		      }
		   }
		}
		for(i=0;i<n-1;i++)
		{
		   System.out.println(s[i]+",");
		}
		System.out.println(s[n-1]);
	}

}


