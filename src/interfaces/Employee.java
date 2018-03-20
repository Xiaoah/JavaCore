package interfaces;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>,Cloneable{
	private String name;
	private double salary;
	private Date hireDay;
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent /100;
		salary += raise;
	}
	
	public Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
		hireDay = new Date();
	}
	
	public void setHireDay(int year,int month,int day)
	{
		Date newHireDay = new GregorianCalendar(year,month-1,day).getTime();
		hireDay.setTime(newHireDay.getTime());
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int compareTo(Employee other){
		return Double.compare(salary, other.salary);
	}
	
	public String toString(){
		return "Employ[name= "+name+",salary= "+salary+",hireDay= "+hireDay+"]";
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		Employee cloned = (Employee) super.clone();
		cloned.hireDay = (Date) hireDay.clone();      //Éî¿ËÂ¡
		return cloned;
	}
}
