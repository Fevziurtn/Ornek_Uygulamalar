import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "delete from musteri where tcno=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "00000000000");
			int sonuc = statement.executeUpdate();
			System.out.println("Kayit silindi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	
	
	
	public static void selectDemo() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		Statement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select adi,soyadi,dtarihi,telNo from musteri");
			ArrayList<Musteri> musteriler = new ArrayList<Musteri>();
			while(resultSet.next()) {
				musteriler.add(new Musteri(resultSet.getString("Adi"),resultSet.getString("Soyadi"),resultSet.getString("dtarihi"),resultSet.getString("telNo")));
			}
			System.out.println(musteriler.size());
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			connection.close();
		}
	}
	
	public static void insertData() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "insert into musteri(TCNo,adi,soyadi,dtarihi,telno) values (?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "00000000000");
			statement.setString(2,"Fevzi");
			statement.setString(3,"Babo");
			statement.setString(4,"1998");
			statement.setString(5,"05468727171");
			int sonuc = statement.executeUpdate();
			System.out.println("Kayit eklendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	public void updateData() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "update musteri set soyadi = 'Babo' where tcno=?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "00000000000");
			int sonuc = statement.executeUpdate();
			System.out.println("Kayit guncellendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}
	}

