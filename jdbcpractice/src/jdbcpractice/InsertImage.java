package jdbcpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			final String driver_Name = "com.mysql.cj.jdbc.Driver";
			final String url = "jdbc:mysql://localhost:9090/java";
			String userName = "root";
			String password = "12@SyZip";
			Connection con = null;
			PreparedStatement psmt = null;
			String sql = "INSERT INTO image(pic)" + "VALUES(?)";
			// register driver class
			Class.forName(driver_Name);
			// create connection
			con = DriverManager.getConnection(url, userName, password);

			if (con.isClosed()) {
				System.out.println("Connection is close");
			} else {
				System.out.println("Database is Connected...!");
				psmt = con.prepareStatement(sql);
				// Inserting Blob type
				InputStream in = new FileInputStream("E:\\collection.png");
				psmt.setBlob(1, in);

				psmt.executeUpdate();
				System.out.println("Record is inserted..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
