package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import musicPlayer.bbdd.pojo.SeriePojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorSerie {
	public List<SeriePojo> getSerie(int idSerie) {
		List<SeriePojo> ret = null;

		String sql = "SELECT series.* FROM series INNER JOIN podcaster ON series.idPodcaster = podcaster.idPodcaster WHERE series.idPodcaster = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idSerie);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<SeriePojo>();

				SeriePojo serie = new SeriePojo();
				serie.setIdSeries(resultSet.getInt("idSeries"));
				serie.setTitle(resultSet.getString("title"));
				java.sql.Date date = resultSet.getDate("startDate");
				serie.setStartDate(new java.util.Date(date.getTime()));
				java.sql.Date date1 = resultSet.getDate("endingDate");
				serie.setEndDate(new java.util.Date(date.getTime()));
				serie.setDescription(resultSet.getString("theDescription"));
				serie.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(serie);
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

	public int getDisckId(String serieSeleccionado ) { 
		int ret = 0;
		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "SELECT idDisc FROM disc WHERE title = ?";

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, serieSeleccionado);
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				ret  = resultSet.getInt("idDisc"); 
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

	public List<SeriePojo> getDisk(String serieSeleccionado ) {
		List<SeriePojo> ret = null;

		String sql = "SELECT * FROM disc WHERE title = ?";

		Connection connection = null;
		PreparedStatement statement = null;


		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.prepareStatement(sql);
			statement.setString(1, serieSeleccionado);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				
				ret = new ArrayList<SeriePojo>();
				
				SeriePojo serie = new SeriePojo();
				serie.setIdSeries(resultSet.getInt("idSeries"));
				serie.setTitle(resultSet.getString("title"));
				java.sql.Date date = resultSet.getDate("startDate");
				serie.setStartDate(new java.util.Date(date.getTime()));
				java.sql.Date date1 = resultSet.getDate("endingDate");
				serie.setEndDate(new java.util.Date(date.getTime()));
				serie.setDescription(resultSet.getString("theDescription"));
				serie.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(serie);
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