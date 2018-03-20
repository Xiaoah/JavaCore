package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class testSerialize implements Serializable{

	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		testSerialize ts = new testSerialize();
		ts.setHeight(170);
		ts.setWidth(120);
		
		try {
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(ts);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("foo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			testSerialize trs = (testSerialize) ois.readObject();
			System.out.println(trs.getHeight());
			System.out.println(trs.getWidth());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


}
