package inheritance;

import java.nio.channels.NonWritableChannelException;

public class ManagerTest {

	public static void main(String[] args) {
		Manager boss = new Manager("Carry", 8000, 2014, 4, 4);
		boss.setBonus(2000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("jaycn", 5000, 2015, 5, 5);
		staff[2] = new Employee("caecg", 5000, 2015, 5, 5);
		
		for(Employee e:staff){
			System.out.println("name: "+e.getName()+"  salary: "+e.getSalary());
		}
		
		Person p = new Student("xah", "computer");
		System.out.print(p.getDescription());
	}

}
