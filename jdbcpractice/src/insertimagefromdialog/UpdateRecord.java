package insertimagefromdialog;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = ConnectionProvider.getConnection();
			String query = "update student set sName=? , sCity=? where sid=?";

			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, "Ananad Gole");
			pstm.setString(2, "Beed");
			pstm.setInt(3, 1);
			
			pstm.executeUpdate();
			System.out.println("Record is Updated...");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
