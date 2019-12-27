
public class Manager extends Employee {
	private Employee[] emp=new Employee[3];
	private int i=0;
    public Manager(int id,String name,int balance)
    {
    	super(id,name,balance);
    }
    public void setJunior(Employee e)
    {
    	emp[i]=new Employee();
    	emp[i]=e;
    	i++;
    }
    public Employee[] getJunior()
    {
    	return emp;
    }
}

