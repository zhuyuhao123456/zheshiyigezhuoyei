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
//		int n=sta.executeUpdate("insert studentinfo values ('1806','����',18) ");
//		if(n>1){
//			
//			System.out.print("�ɹ�");
//			
//		}
	
	 ResultSet rs=(ResultSet) sta.executeQuery("select * from studentinfo");
	 while (rs.next()){
		 String xh=rs.getString(1);
		 System.out.println("ѧ��:"+xh);
		 String name=rs.getString(2);
		 System.out.println("����:"+name);
		 int age=rs.getInt(3);
		 System.out.println("����:"+age);
	 }
	  }
	 catch(ClassNotFoundException e){
		 e.printStackTrace();
		 System.out.print("û�ҵ�");
		 
	 }
	 catch(SQLException sqle){
		 
		 System.out.print("�����쳣");
	 }
//	 finally{
//		 System.out.print("����");
//		 
//	 }
	 
 }
}