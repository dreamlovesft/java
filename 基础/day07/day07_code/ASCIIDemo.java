/*
    ASCII�������ʾ
	�ַ�Java ��������,char
	����Java ��������,int
	
	int ���ͺ� char ��������ת��
	char  �����ֽ�, int �ĸ��ֽ�
	
	charת��int���͵�ʱ��,�����Զ���ʾ,char��������,���ѯ�����,�õ�����
	intת��char���͵�ʱ��,ǿ��ת��,���ѯ�����
	
	char�洢����,��ѯUnicode�����
	
	char���Ժ�int����,��ʾΪint����, �ڴ��������ֽ�
	charȡֵ��Χ��0-65535, �޷��ŵ���������
*/
public class ASCIIDemo{
	public static void main(String[] args){
		char c = 'a';
		int i = c + 2;
		System.out.println(i); // 99
		
		int j = 90;
		char h = (char)j;
		System.out.println(h); // Z
		
		System.out.println( (char)7 );
		
		char k = '��';
		System.out.println(k); // ��
		
		
//		char m = -1;
	}
}