package Net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) throws InterruptedException {
		
		try {
			//创建socket
			Socket socket = new Socket("192.168.0.9",5551);
			//获取输出流，用于发送信息
			OutputStream os = socket.getOutputStream();  //字节输出流
			
			
			DataOutputStream dos = new DataOutputStream(os);
	
			dos.writeBytes("xiaoah\n");         //必须要加在 \n logstah应该是以行为结尾的，而且linux下必须看到\n
		
			
	/*		PrintWriter pw = new PrintWriter(os);        //将输出流包装成打印流
			pw.write("name:xiaoah");
			pw.flush();
	*/		
			//打印返回信息
	/*		InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
	*/		
			socket.shutdownOutput();                        //关闭输出流
			
			//关闭其他资源
	//		br.close();
	//		isr.close();
	//		is.close();
			
		//	pw.close();
			dos.close();
			os.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
