import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
public static void main(String[] args) throws SQLException {
	Connection connection = null;
	Statement statement = null;
	ResultSet  resultset;
	dbHelper dbHelper = new dbHelper();
	try {
		connection = dbHelper.getConnection();
		
		statement = connection.createStatement();
		resultset=statement.executeQuery("select * from kullanicilar.bilgiler");
		while(resultset.next()) {
			System.out.print(resultset.getString("idBilgi"));
		}
	} catch (SQLException e) {
		dbHelper.showErrorMessages(e);
	}
	finally {
		connection.close();
		statement.close();
		
	}
}
}
