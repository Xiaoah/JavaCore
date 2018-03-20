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
			//����ServerSocket
			ServerSocket serverSocket = new ServerSocket(8888);
			//����accept�����˿ڣ��ȴ�����
			System.out.println("****�������������ȴ��ͻ�������***");
			Socket socket = serverSocket.accept();
			//��ȡ����������ȡ�ͻ�����Ϣ
			InputStream is = socket.getInputStream();    //�ֽ�������
			InputStreamReader isr = new InputStreamReader(is);  //���ֽ���ת��Ϊ�ַ���
			BufferedReader br = new BufferedReader(isr);    //Ϊ��������ӻ���
			
			//ѭ����ȡ����
			String info = null;
			while((info=br.readLine()) != null){
				System.out.println("i am server,client said:"+info);
			}
			socket.shutdownInput();     //�ر�������
			//�ر�������Դ
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
