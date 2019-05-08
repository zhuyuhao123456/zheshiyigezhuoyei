import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;


public class Ja {
 public static void main( String [] args){
	 Connection con=null;
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		 con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studb","root","");
		
		Statement sta= (Statement)con.createStatement();
//		int n=sta.executeUpdate("insert studentinfo values ('1806','刘毅',18) ");
//		if(n>1){
//			
//			System.out.print("成功");
//			
//		}
	
	 ResultSet rs=(ResultSet) sta.executeQuery("select * from studentinfo");
	 while (rs.next()){
		 String xh=rs.getString(1);
		 System.out.println("学号:"+xh);
		 String name=rs.getString(2);
		 System.out.println("姓名:"+name);
		 int age=rs.getInt(3);
		 System.out.println("年龄:"+age);
	 }
	  }
	 catch(ClassNotFoundException e){
		 e.printStackTrace();
		 System.out.print("没找到");
		 
	 }
	 catch(SQLException sqle){
		 
		 System.out.print("连接异常");
	 }
//	 finally{
//		 System.out.print("好了");
//		 
//	 }
	 
 }
}