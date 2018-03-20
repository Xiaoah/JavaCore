package Net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * logstash客户端，连接、发送数据到logstash
 * @author xiaoah
 *
 */
public class LogstashClient {
	
	private String url = null;
	private int port = 0;
	private Socket socket = null;
	private DataOutputStream dos = null;
	
	/**
	 * LogstashClient的构造方法
	 * @param url ip地址
	 * @param port  端口号
	 */
	public LogstashClient(String url,int port){
		this.url = url;
		this.port = port;
	}
	
	/**
	 * 不要使用未初始化的构造方法
	 */
	public LogstashClient(){
		
	}
	
	/**
	 * 连接Logstash
	 */
	public void connect(){
		try {
			socket = new Socket(url,port);
			System.out.println("connect to logstash successfully");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 关闭连接
	 */
	public void close() {
		try {
			socket.shutdownInput();
			socket.shutdownOutput();
			socket.close();
			System.out.println("close the connect");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 写数据写到logstash中
	 * @param str json格式的数据
	 */
	public void writeLine(String str){
		try {
			OutputStream ops = socket.getOutputStream();
			dos = new DataOutputStream(ops);
			dos.writeBytes(str+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		LogstashClient lc = new LogstashClient("192.168.0.9",5551);
		lc.connect();
	//	lc.writeLine("{\"name\":\"xiaoah\",\"age\":37}");
		lc.writeLine("{\"people\":["
				+ "{\"name\":\"xiao\",\"age\":12},"
				+ "{\"name\":\"zhou\",\"age\":22}"
				+ "]}");
		lc.close();
		
		
		/*
		BufferedReader brKey = null;
		BufferedReader brNet = null;
		DataOutputStream dos = null;
		Socket s = null;
		
		try {
			s = new Socket("192.168.0.9", 5551);
			InputStream ips = s.getInputStream();
			OutputStream ops = s.getOutputStream();
			
			brKey = new BufferedReader(new InputStreamReader(System.in));
			dos = new DataOutputStream(ops);
			brNet = new BufferedReader(new InputStreamReader(ips));
			
			while(true)
			{
				String strWord = brKey.readLine();
				//dos.writeBytes(strWord+System.getProperty("line.separator"));
				dos.writeBytes(strWord+"\n");
				if(strWord.equalsIgnoreCase("quit")){
					break;
				}else{
					System.out.println(strWord);
				}
			}
			
			
			s.shutdownOutput();
			s.close();
			brKey.close();
			brNet.close();
			dos.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		*/
	}

}
