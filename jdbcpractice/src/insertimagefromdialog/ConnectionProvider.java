package insertimagefromdialog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection con;
	static String driver_Name = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:9090/java";

	public static Connection getConnection() {

		try {

			if (con == null) {
				Class.forName(driver_Name);
				con = DriverManager.getConnection(url, "root", "12@SyZip");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return con;

	}
}
