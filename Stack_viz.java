import java.io.*;
import java.util.*;

class StackDemo //Stack visualisation using an array
{
	private int n;//size of the array;
	private int a[];
	private int tos;
	private int size;
	
	StackDemo(int no)
	{
		a = new int[no];
		n = no;
		tos = -1;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return (tos == -1);
	}

	public boolean isFull()
	{
		return (tos == n-1);
	}
	
	public boolean push(int data) //return false if stack is full, true if successfully pushed.
	{
		if(isFull())
			return false;
		else
		{
			a[++tos] = data;
			size++;
			return true;		
		}
	}
	
	public int pop()
	{
		if(isEmpty())
			return 0;
		else
		{
			size--;
			return a[tos--];
		}
	}
	
	public int peek()
	{
		return a[tos];
	}
}

class Stack_viz
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Stack:");
		StackDemo stack = new StackDemo(sc.nextInt());
		
		boolean flag = true;
		do
		{
		
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.isFull\n5.isEmpty\n6.Exit\n\nEnter your choice.\n");
			switch(sc.nextInt())
			{
				case 1:
					System.out.println("Enter the data to push into stack");
					if(stack.push(sc.nextInt()))
						System.out.println(stack.peek()+" successfully pushed.");
					else
						System.out.println("Stack is full.\n");
					break;
					
				case 2:
					int p = stack.pop();
					if(p == 0)
						System.out.println("Stack is empty.\n");
					else
						System.out.println(p+" was pooped.\n");
					break;
				case 3:
					System.out.println(stack.peek()+" is the top element.\n");
					break;
				case 4:
					System.out.println(stack.isFull()+"\n");
					break;
				case 5:
					System.out.println(stack.isEmpty()+"\n");
					break;
				case 6:
					flag=false;
					break;
			}
			
		}while(flag!=false);
		
	}
}
