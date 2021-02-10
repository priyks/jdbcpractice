package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDynamicQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String driver_Name = "com.mysql.cj.jdbc.Driver";
		final String url = "jdbc:mysql://localhost:9090/java";
		String userName = "root";
		String password = "12@SyZip";
		Connection con = null;
		PreparedStatement psmt = null;
		String sql = "INSERT INTO student(sName,sCity)"
	            + "VALUES(?,?)";			

		try {

			Class.forName(driver_Name);

			con = DriverManager.getConnection(url, userName, password);

			if (con.isClosed()) {
				System.out.println("Connection is close");
			} else {
				System.out.println("Database is Connected...!");
				psmt = con.prepareStatement(sql);
			    psmt.setString(1, "prachi sartape");
			    psmt.setString(2, "satara");
				psmt.executeUpdate();
				System.out.println("Record is inserted..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
