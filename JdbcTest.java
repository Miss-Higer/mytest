package cn.it.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//1.	注册驱动.
		
//		JDBC规范（掌握四个核心对象）：
//		DriverManager:用于注册驱动
//		Connection: 表示与数据库创建的连接
//		Statement: 操作数据库sql语句的对象
//		ResultSet: 结果集或一张虚拟表

Class.forName("com.mysql.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/jdbc";		
  String     user="root";
  String     password="123456";

		
		
		//2.	获得连接.
//JDBC所有的包都在java.sql
  Connection coon =DriverManager.getConnection(url, user, password);


		//3.	获得执行sql语句的对象
  Statement stem=coon.createStatement();
  
		//4.	执行sql语句，并返回结果
  ResultSet   rt  =stem.executeQuery("select * from student");
  
  
		//5.	处理结果
  
        while(rt.next()) {
        	
        	 Integer id= rt.getInt("id");
        	  String  name=rt.getString("name");
        	  Integer phone=rt.getInt("phone"); 
        	System.out.println(id+":"+name+":"+phone);
        }
  
		//6.	释放资源.

	coon.close();
	stem.close();
	rt.close();
		
		
		
		
		
		
		
		
		
	}

}
