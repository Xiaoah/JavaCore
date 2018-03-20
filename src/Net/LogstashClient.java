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
 * logstash�ͻ��ˣ����ӡ��������ݵ�logstash
 * @author xiaoah
 *
 */
public class LogstashClient {
	
	private String url = null;
	private int port = 0;
	private Socket socket = null;
	private DataOutputStream dos = null;
	
	/**
	 * LogstashClient�Ĺ��췽��
	 * @param url ip��ַ
	 * @param port  �˿ں�
	 */
	public LogstashClient(String url,int port){
		this.url = url;
		this.port = port;
	}
	
	/**
	 * ��Ҫʹ��δ��ʼ���Ĺ��췽��
	 */
	public LogstashClient(){
		
	}
	
	/**
	 * ����Logstash
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
	 * �ر�����
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
	 * д����д��logstash��
	 * @param str json��ʽ������
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
