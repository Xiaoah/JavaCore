package inheritance;

import java.time.LocalDate;
import java.util.Objects;

import javax.print.attribute.standard.MediaSize.Other;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name,double salary,int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
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

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public boolean equals(Object otherObject){
		
		if(this == otherObject) return true;
		
		if(otherObject == null) return false;
		
		if(getClass() != otherObject.getClass()) return false;
		
		Employee other = (Employee) otherObject;
		return Objects.equals(name,other.name) && salary==other.salary
				&& Objects.equals(hireDay,other.hireDay);
	}
	
	public int hashCode(){
		return Objects.hash(name,salary,hireDay);
	}
	
	public String toString(){
		return getClass().getName()+"[name=]"+name+",salary="+salary+
				",hireDay="+hireDay+"]";
	}
	
	

}
