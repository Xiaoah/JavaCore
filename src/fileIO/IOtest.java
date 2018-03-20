package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.function.BinaryOperator;

public class IOtest {

	public static void main(String[] args) {
		
		//字节流
//		try {
//			FileInputStream fin = new FileInputStream("E:\\java\\JavaCore\\test.txt");
//			BufferedInputStream bin = new BufferedInputStream(fin);
//			int ch = bin.read();
//			while(ch != -1){
//				System.out.print((char)ch);
//				ch = bin.read();
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}finally{
//		
//		}
		
		//字符流 
//		try {
//			FileReader fr = new FileReader("E:\\java\\JavaCore\\test.txt");
//			BufferedReader br = new BufferedReader(fr);
//			FileWriter fw = new FileWriter("E:\\java\\JavaCore\\test2.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			String str = br.readLine();
//			while(str != null){
//				bw.write(str);
//				bw.newLine();
//				str = br.readLine();
//			}
//			br.close();
//			bw.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
		//创建文件
//		File f = new File("E:\\java\\JavaCore\\test1.txt");
//		if(!f.exists()){
//			System.out.print("文件不存在，现在创建");
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}else{
//			System.out.println("文件存在");
//		}
		
		File file1 = new File("E:\\java\\JavaCore\\test.txt");
		File file2 = new File("E:\\java\\JavaCore\\test2.txt");
		File file3 = new File("E:\\java\\JavaCore\\test1.txt");
		
		String line1 = "";
		String line2 = "";
		String str1="";
		String str2 = "";
		String str="";
		int id = 1;
		
		try {
			FileReader fr1 = new FileReader(file1);
			FileReader fr2 = new FileReader(file2);
			FileWriter fw = new FileWriter(file3);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			line1 = br1.readLine();
			line2 = br2.readLine();
			
			while(line1 != null){
				if(id % 4 ==1){
					str1 = line1;
					str2 = line2;
				}else{
					str1 += "|"+line1;
					str2 += "|"+line2;
				}
				if(id%4==0){
					str = str1+"|"+str2+"\r\n";
					System.out.print(str);
					bw.write(str);
					//bw.newLine();
				}
				line1 = br1.readLine();
				line2 = br2.readLine();
				id++;
			}
			
			br1.close();
			br2.close();
			bw.close();
			fr1.close();
			fr2.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
