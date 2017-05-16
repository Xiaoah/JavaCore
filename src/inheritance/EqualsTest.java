package inheritance;

public class EqualsTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("alice", 5000, 2001, 1, 1);
		Employee e2 = e1;
		Employee e3 = new Employee("alice", 5000, 2001, 1, 1);
		Employee bob = new Employee("bob", 10000, 2002, 2, 2);
		
		System.out.println("e1==e2:"+(e1==e2));
		System.out.println("e1==e3:"+(e1==e3));
		System.out.println("e1.equals(e3):"+e1.equals(e3));
		System.out.println("e1.equals(bob):"+e1.equals(bob));
		
		Manager carl = new Manager("carl", 8000, 1997, 7, 7);
		Manager boss = new Manager("carl", 8000, 1997, 7, 7);
		boss.setBonus(5000);
		System.out.println("boss:"+boss);
		System.out.println("carl.equals(boss):"+carl.equals(boss));
		System.out.println("e1.hascode():"+e1.hashCode());
		System.out.println("e3.hascode():"+e3.hashCode());
		

	}

}
