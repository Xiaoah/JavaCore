package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
		
		try {
			//创建ServerSocket
			ServerSocket serverSocket = new ServerSocket(8888);
			//调用accept监听端口，等待连接
			System.out.println("****服务器启动，等待客户端连接***");
			Socket socket = serverSocket.accept();
			//获取输入流，读取客户端信息
			InputStream is = socket.getInputStream();    //字节输入流
			InputStreamReader isr = new InputStreamReader(is);  //将字节流转换为字符流
			BufferedReader br = new BufferedReader(isr);    //为输入流添加缓冲
			
			//循环读取输入
			String info = null;
			while((info=br.readLine()) != null){
				System.out.println("i am server,client said:"+info);
			}
			socket.shutdownInput();     //关闭输入流
			//关闭其他资源
			br.close();
			isr.close();
			is.close();
			socket.close();
			serverSocket.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
