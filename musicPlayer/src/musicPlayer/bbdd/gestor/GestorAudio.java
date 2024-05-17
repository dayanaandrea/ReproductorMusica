package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import musicPlayer.bbdd.pojo.AudioPojo;
import musicPlayer.bbdd.pojo.PodcastPojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorAudio {


	public int obtenerDatosAudioId(String discoSeleccionado) {
		int ret = 0;
		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "SELECT idBand FROM band WHERE theName = ?";

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.prepareStatement(sql);

			statement.setString(1, discoSeleccionado);
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
	public List<AudioPojo> getSongDisks(int idDisk) {
		List<AudioPojo> ret = null;

		String sql = "SELECT audio.* FROM audio INNER JOIN disc ON audio.idDisc = disc.idDisc WHERE audio.idDisc = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idDisk);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<AudioPojo>();

				AudioPojo audio = new AudioPojo();
				audio.setId(resultSet.getInt("idAudio"));
				audio.setTitle(resultSet.getString("Title"));
				audio.setDuration(resultSet.getInt("Duration"));
				audio.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(audio);
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
	public List<AudioPojo> getDisk(String cancionSeleccionada ) {
		List<AudioPojo> ret = null;

		String sql = "SELECT * FROM audio WHERE title = ?";

		Connection connection = null;
		PreparedStatement statement = null;


		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.prepareStatement(sql);
			statement.setString(1, cancionSeleccionada);
			ResultSet resultSet = statement.executeQuery();

			
			while (resultSet.next()) {

				
				ret = new ArrayList<AudioPojo>();
				
				AudioPojo audio = new AudioPojo();
				audio.setId(resultSet.getInt("idAudio"));
				audio.setTitle(resultSet.getString("title"));
				audio.setDuration(resultSet.getInt("duration"));
				audio.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				
				ret.add(audio);
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

	public List<PodcastPojo> getPodcastSerie(int idDisk) {
		List<PodcastPojo> ret = null;

		String sql = "SELECT audio.* FROM audio INNER JOIN disc ON audio.idDisc = disc.idDisc WHERE audio.idDisc = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idDisk);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<PodcastPojo>();

				PodcastPojo podcast = new PodcastPojo();
				podcast.setId(resultSet.getInt("idAudio"));
				podcast.setTitle(resultSet.getString("Title"));
				podcast.setDuration(resultSet.getInt("Duration"));
				podcast.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(podcast);
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
	public List<PodcastPojo> getPodcast(String cancionSeleccionada ) {
		List<PodcastPojo> ret = null;

		String sql = "SELECT * FROM audio WHERE title = ?";

		Connection connection = null;
		PreparedStatement statement = null;


		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.prepareStatement(sql);
			statement.setString(1, cancionSeleccionada);
			ResultSet resultSet = statement.executeQuery();

			
			while (resultSet.next()) {

				
				ret = new ArrayList<PodcastPojo>();
				
				PodcastPojo podcast = new PodcastPojo();
				podcast.setId(resultSet.getInt("idAudio"));
				podcast.setTitle(resultSet.getString("title"));
				podcast.setDuration(resultSet.getInt("duration"));
				podcast.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				
				ret.add(podcast);
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
