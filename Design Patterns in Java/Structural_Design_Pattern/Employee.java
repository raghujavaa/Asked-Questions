package Structural_Design_Pattern;

public interface Employee 

{
	
	public  int getId();
	
	public String getName();
	
	public double getSalary();
	
    public void print();
	
	public void add(Employee employee);
	
    public void remove(Employee employee);
    
    public Employee getChild(int i);
   
}
