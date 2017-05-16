package basic;

import java.util.Random;

public class StaticTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("xah", 1000);
		staff[1] = new Employee("jkf", 2000);
		staff[2] = new Employee("jay", 3000);
		
		for(Employee e : staff){
			System.out.println(e.getName()+" "+e.getId()+"  "+e.getSalary());
			e.setNextId(e.getNextId()+1);
		}
		int n = Employee.getNextId();
		System.out.println("static nextid: "+n);
	}

}

class Employee{
	private static int nextId;
	private String name;
	private double salary;
	private int id;
	
	//��̬���ʼ����
	static{
		Random generator = new Random();       //����һ�������������
		nextId = generator.nextInt(10000);    //����һ��0-9999�������
	}
	
	//��ʼ�������
	{
		id = nextId;
		nextId++;
	}
	//�޲ι��췽��
	public Employee(){}
	
	public Employee(String name,double s){
		this.name = name;
		this.salary = s;
		this.id = 0;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args){
		Employee e = new Employee("xah", 1234.213);
		System.out.println(e.getName()+" "+e.getSalary());
	}
	
}