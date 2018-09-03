package Collection;
import java.util.*;
class A
{
	int id;
	String name;
	double sal;
	Scanner sc=new Scanner(System.in);
	ArrayList al=new ArrayList();

	void insert()
	{
		A obj;
		System.out.println("========insertion========");
		for(int i=0;i<=2;i++)
		{
			obj=new A();
			obj.id=(sc.nextInt());
			obj.name=sc.next();
			obj.sal=sc.nextDouble();
			al.add(obj);
		}
	}
	void display()
	{
		System.out.println("==========Display==========");
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			A obj=(A)itr.next();
			System.out.println(obj.id+"\t"+obj.name+"\t"+obj.sal);
		}
	}
	void delete()
	{
		System.out.println("=================delete=====================");
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			System.out.println("Enter the id to delete the record :");
			int id=sc.nextInt();
			A obj=(A)itr.next();
			if(obj.id==id)
			{
				itr.remove();
			}
		}
	}
	void update()
	{
		System.out.println("enter the id,name,salary to update the record :");
		int id=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		int temp=0;
		String nametemp="";
		double salarytemp=0;
		for(Iterator itr=al.iterator();itr.hasNext();)
		{
			A obj=(A)itr.next();
			if(obj.id==id)
			{
				temp=obj.id;
				obj.id=id;
				id=temp;
				
				nametemp=obj.name;
				obj.name=name;
				name=nametemp;
				
				salarytemp=obj.sal;
				obj.sal=sal;
				sal=salarytemp;
			}
			
		}
	
				
	}
	public void search()
	{
		System.out.println("enetr the id which u want to search=");
		int id1=sc.nextInt();
		for(Iterator itr=al.iterator();itr.hasNext();)
			
		{
			A e=(A)itr.next();
			if(e.id==id1)
			{
				System.out.println(e.id+"\t"+e.name+"\t"+e.sal);
			}
		}
	}
}

public class CreateAll
{
	public static void main(String args[]) {
		/*A obj=new A();
		obj.insert();
		obj.display();
		obj.update();
		obj.display();*/
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		A obj=new A();
		do
		{
		System.out.println("1:insert\n2:delete\n3:search\n4:update\n5:display");
		System.out.println("enter your choice:");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			obj.insert();
			break;
		case 2:
			obj.delete();
			break;
		case 3:
			obj.search();
			break;
		case 4:
			obj.update();
			break;
		case 5:
			obj.display();
			break;
		}
		System.out.println("you want to process:y/n?");
		String str=sc.next();
		char ch=str.charAt(0);
		if(ch=='n')
		{
			flag=false;
			break;
		}
	}while(flag==true);
}
}