package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String driver_Name = "com.mysql.cj.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:9090/java";
		String userName = "root";
		String password = "12@SyZip";
		Connection con = null;
		Statement st = null;
		String query = "create table student(sid int(10) primary key auto_increment, sName varchar(25) not null, sCity varchar(20) not null)";

		try {

			Class.forName(driver_Name);

			con = DriverManager.getConnection(url, userName, password);

			if (con.isClosed()) {
				System.out.println("Connection is close");
			} else {
				System.out.println("Database is Connected...!");
				st = con.createStatement();
				st.executeUpdate(query);
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
