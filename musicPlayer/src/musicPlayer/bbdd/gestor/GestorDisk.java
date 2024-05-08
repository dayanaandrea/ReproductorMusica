package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorDisk {

	public int obtenerNumeroDiscos() {
		int totalDiscs = 0;
		String sql = "SELECT COUNT(idDisc) AS total FROM disc";

		Connection connection = null;
		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				totalDiscs = resultSet.getInt("total");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return totalDiscs;

	}

	public List<DiskPojo> getAllDisks(int numeroAleatorio) {
		List<DiskPojo> ret = null;

		String sql = "SELECT * FROM disc where idDisc = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, numeroAleatorio);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<DiskPojo>();

				DiskPojo disk = new DiskPojo();
				disk.setIdDisk(resultSet.getInt("idDisc"));
				disk.setImage(resultSet.getString("image"));
				disk.setTitle(resultSet.getString("title"));
				java.sql.Date date = resultSet.getDate("publicationDate");
				disk.setPublicationDate(new java.util.Date(date.getTime()));
				disk.setGender(resultSet.getString("genre"));
				disk.setDescription(resultSet.getString("theDescription"));
				disk.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(disk);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		return ret;
	}
}