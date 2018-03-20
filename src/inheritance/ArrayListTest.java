package inheritance;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		staff.add(new Employee("xxx", 5000, 1994, 3, 10));
		staff.add(new Employee("hary", 3000, 2000, 5, 1));
		staff.add(new Employee("jki", 9000, 2001, 4, 2));

		for(Employee e:staff){
			e.raiseSalary(5);
		}
		for(int i =0;i<staff.size();i++){
			Employee e = staff.get(i);
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+
					",hireDay="+e.getHireDay());
		}
	}

}
