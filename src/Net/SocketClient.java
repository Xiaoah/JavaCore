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
			//����socket
			Socket socket = new Socket("192.168.0.9",5551);
			//��ȡ����������ڷ�����Ϣ
			OutputStream os = socket.getOutputStream();  //�ֽ������
			
			
			DataOutputStream dos = new DataOutputStream(os);
	
			dos.writeBytes("xiaoah\n");         //����Ҫ���� \n logstahӦ��������Ϊ��β�ģ�����linux�±��뿴��\n
		
			
	/*		PrintWriter pw = new PrintWriter(os);        //���������װ�ɴ�ӡ��
			pw.write("name:xiaoah");
			pw.flush();
	*/		
			//��ӡ������Ϣ
	/*		InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
	*/		
			socket.shutdownOutput();                        //�ر������
			
			//�ر�������Դ
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
