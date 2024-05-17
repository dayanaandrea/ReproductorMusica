package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import musicPlayer.bbdd.pojo.GroupPojo;
import musicPlayer.bbdd.pojo.PodcasterPojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorPodcaster {

	public List<PodcasterPojo> getAllGroup() {
		List<PodcasterPojo> ret = null;

		String sql = "SELECT * FROM podcaster";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<PodcasterPojo>();
				PodcasterPojo podcaster = new PodcasterPojo();
				podcaster.setId(resultSet.getInt("idPodcaster"));
				System.out.println();
				podcaster.setImagen(resultSet.getString("image"));
				podcaster.setName(resultSet.getString("theName"));
				java.sql.Date date = resultSet.getDate("UnionDate");
				podcaster.setUnionDate(new java.util.Date(date.getTime()));
				podcaster.setDescription(resultSet.getString("theDescription"));
				podcaster.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(podcaster);
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

	public int getPodcasterId(String podcasterSeleccionado) {
		int ret = 0;
		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "SELECT idBand FROM band WHERE theName = ?";

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.prepareStatement(sql);

			statement.setString(1, podcasterSeleccionado);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				ret  = resultSet.getInt("idBand"); 
			}

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {

			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {

			}
		}
		return ret;
	}
	public List<PodcasterPojo> getPodcaster(String podcasterSeleccionado ) {
		List<PodcasterPojo> ret = null;

		String sql = "SELECT * FROM podcaster WHERE theName = ?";

		Connection connection = null;
		PreparedStatement statement = null;


		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.prepareStatement(sql);
			statement.setString(1, podcasterSeleccionado);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				
				ret = new ArrayList<PodcasterPojo>();
				
				PodcasterPojo podcaster = new PodcasterPojo();
				podcaster.setId(resultSet.getInt("idPodcaster"));
				podcaster.setImagen(resultSet.getString("image"));
				podcaster.setName(resultSet.getString("theName"));
				java.sql.Date date = resultSet.getDate("unionDate");
				podcaster.setUnionDate(new java.util.Date(date.getTime()));
				podcaster.setDescription(resultSet.getString("theDescription"));
				podcaster.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				
				ret.add(podcaster);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
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