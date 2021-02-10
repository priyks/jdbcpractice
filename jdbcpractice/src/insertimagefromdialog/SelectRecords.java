package insertimagefromdialog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConnectionProvider.getConnection();
			String query = "select * from student";
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("--------");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
