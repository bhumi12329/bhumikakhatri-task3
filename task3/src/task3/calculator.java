package task3;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public  class calculator extends data implements operation
{

	public calculator() 
	{
		super();
	}
	public void getvalue() {
		String i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		a=sc.nextInt();
		b=sc.nextInt();
		do
    	{
    	calci();
    	
    	System.out.println("Do u want to continue yes/no ?");
        i=sc.next();
    	}while(i=="yes");
    }
		
	public void calci() 
	   {
		   int ch;
		   String i;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter first value");
			a=sc.nextInt();
			System.out.println("enter Second value");
			b=sc.nextInt();
			do
			{
			System.out.println("1.addition 2.subtraction 3.multiplication 4.divide");
			System.out.println("enter the opertion");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1:
			{
	            c=add(a,b);
				break;
			}
			case 2:
			{
				 c=sub(a,b);
				 break;
			}
			case 3:
			{
				c=mult(a,b);
				break;
			}
			case 4:
			{
			    c=div(a,b);
				break;
			}
			
			}
			System.out.println(c);	
			System.out.println("Do u want to continue yes/no ?");
	        i=sc.next();
	    	}while(i=="yes");
	}
    public int div(int a,int b) 
    {
		return b/a;
	}
	public int mult(int a,int b) 
	{
		return a*b;
	}
	public int sub(int a,int b) 
	{
		return a-b;
	}
	public int add(int a,int b) 
	{
		return a+b;
	}
	public static void main(String[] args)
    {
		String i ;
    	calculator c1=new calculator();
    	c1.calci();
    }
}
