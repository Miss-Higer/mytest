package cn.it.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//1.	ע������.
		
//		JDBC�淶�������ĸ����Ķ��󣩣�
//		DriverManager:����ע������
//		Connection: ��ʾ�����ݿⴴ��������
//		Statement: �������ݿ�sql���Ķ���
//		ResultSet: �������һ�������

Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jdbc";		
  String     user="root";
  String     password="123456";

		
		
		//2.	�������.
//JDBC���еİ�����java.sql
  Connection coon =DriverManager.getConnection(url, user, password);


		//3.	���ִ��sql���Ķ���
  Statement stem=coon.createStatement();
  
		//4.	ִ��sql��䣬�����ؽ��
  ResultSet   rt  =stem.executeQuery("select * from student");
  
  
		//5.	������
  
        while(rt.next()) {
        	
        	 Integer id= rt.getInt("id");
        	  String  name=rt.getString("name");
        	  Integer phone=rt.getInt("phone"); 
        	System.out.println(id+":"+name+":"+phone);
        }
  
		//6.	�ͷ���Դ.

	coon.close();
	stem.close();
	rt.close();
		
		
		
		
		
		
		
		
		
	}

}
