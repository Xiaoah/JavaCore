package annotate;

public class ParseAnn {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("annotate.Test");
			boolean isExist = c.isAnnotationPresent(Description.class);
			if(isExist){
				Description d = (Description)c.getAnnotation(Description.class);
				System.out.println(d.desc());
				System.out.println(d.author());
			}else{
				System.out.println("no exist");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
