package cn.itcast.demo;

public class Demo02 {

	 public static void main(String[] args) {
		Test01 t = new Test01();
		int method = t.method();
		System.out.println(method);
		//����·����ÿ������return�ͻ��ڷ���·������ʱ�洢��������ص�ֵ��
		//���۷��������κεĸı䣬����·���е����ֵһ�²��䡣        		 
	}
}
class Test01{
	 
     public int method(){
    	 int i = 0 ;
    	 try{
    		 System.out.println(1/0);
    		 return i;
    	 }catch (Exception e) {
    		// e.printStackTrace();
    	}finally{
    		i = 20;
    		System.out.println("��һ��ִ��"+i);
    	}
    	 return i;
     }
	
	
}
