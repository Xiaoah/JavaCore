package annotate;

@Description(desc="i am ok",author="xah",age=18)
public class Test {
	
	@SuppressWarnings("deprecation")     //���Թ�ʱ����
	
	public void sing(){
		Person p = new Child();
		p.sing();
	}
}
