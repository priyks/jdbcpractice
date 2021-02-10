package insertimagefromdialog;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ChooseImageAndStoreInDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection con = ConnectionProvider.getConnection();
			String query = "Insert into image(pic) values(?)";

			PreparedStatement pstm = con.prepareStatement(query);
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File file = jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);
		    pstm.setBinaryStream(1, fis, fis.available());
		    // Returns an estimate of the number of remaining 
		    //bytes that can be read (or skipped over)
		    pstm.executeUpdate();
		    
		    JOptionPane.showMessageDialog(null, "Image Inserted Successfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
