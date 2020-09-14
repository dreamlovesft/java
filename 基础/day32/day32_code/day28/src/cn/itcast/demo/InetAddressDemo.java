package cn.itcast.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  ��ʾ�������е�IP��ַ
 *    java.net.InetAddress
 *  ��̬����
 *    static InetAddress  getLocalHost()   LocalHost��������
 *    ���ر�������,����ֵInetAddress����
 *    
 *    static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
 *    
 *  �Ǿ�̬����
 *     String getHoustAddress()��ȡ����IP��ַ
 *     String getHoustName()��ȡ������
 *    
 */
public class InetAddressDemo {
	public static void main(String[] args)throws UnknownHostException {
		function();
	}
	/*
	 * static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
	 */
	public static void function_1()throws UnknownHostException {
		InetAddress inet = InetAddress.getByName("www.baidu.com");
		System.out.println(inet); // www.baidu.com/39.156.66.18
	}
	
	/*
	 *  static InetAddress  getLocalHost()   LocalHost��������
	 */
	public static void function() throws UnknownHostException{
		InetAddress inet = InetAddress.getLocalHost();
		//����������������,�� IP��ַ
		System.out.println(inet.toString()); // DESKTOP-TVCC3NF/10.15.5.64
		
		String ip = inet.getHostAddress();
		String name = inet.getHostName();
		System.out.println(ip+"   "+name); // 10.15.5.64   DESKTOP-TVCC3NF
		
		/*String host = inet.toString();
		String[] str = host.split("/");
		for(String s : str){
			System.out.println(s); // DESKTOP-TVCC3NF  10.15.5.64
		}*/
	}
}





