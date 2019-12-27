
public class Source {
	public static void display(Employee[] e)
	{   for(int i=0;i<3;i++)
	{
		System.out.println("Id = "+ e[i].getId() +" Name = " + e[i].getName() + " Balance= " + e[i].getBalance());
	}
	}
public static void main(String[] args)
{
	Employee[] e=new Employee[3];
	Employee[] j=new Employee[3];
	String []s= new String[3];
	Manager man=new Manager(4,"arun",12345);
	s[0]="pranav";
	s[1]="sathya";
	s[2]="binet";
	for(int i=1;i<4;i++)
	{
		e[i-1] = new Employee(i,s[i-1],i*10000);
		man.setJunior(e[i-1]);
	}
	
	//display(e);
	System.out.println(man.getName());
	display(man.getJunior());
}
}
