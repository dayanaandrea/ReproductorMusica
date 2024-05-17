package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import musicPlayer.bbdd.pojo.AccountPojo;
import musicPlayer.bbdd.pojo.PremiunPojo;
import musicPlayer.bbdd.pojo.UserPojo;

public class GestorRegister {
    
    public void insertUser(UserPojo userPojo, AccountPojo accountPojo, PremiunPojo premiunPojo, boolean isPremium) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(musicPlayer.bbdd.utils.DBUtils.DRIVER);
            connection = DriverManager.getConnection(musicPlayer.bbdd.utils.DBUtils.URL, musicPlayer.bbdd.utils.DBUtils.USER,
                    musicPlayer.bbdd.utils.DBUtils.PASS);
            statement = connection.createStatement();

            String userInsertsql = "insert into theuser (userName, theName, surname1, surname2, dni, birthDate, address, postalCode, city, province, userType, pass_word) "
                    + "VALUES ('" + accountPojo.getUser() + "', '" + userPojo.getTheName() + "', '"
                    + userPojo.getSurname1() + "', '" + userPojo.getSurname1() + "', '" + userPojo.getDni() + "', '"
                    + userPojo.getBirthDate() + "', '" + userPojo.getAddress() + "', '" + userPojo.getPostalCode()
                    + "', '" + userPojo.getCity() + "', '" + userPojo.getProvince() + "', '" + (isPremium ? "premium" : "free") + "', '"
                    + accountPojo.getPassword() + "')";
            int rowsAffected = statement.executeUpdate(userInsertsql, Statement.RETURN_GENERATED_KEYS);

            if (rowsAffected == 1) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);
                    String premiunInsertsql = "insert into premium (idUser, cardNumber, dateOfExpiry, cvv_cvc) "
                            + "VALUES ('" + userId + "', '" + premiunPojo.getNumberCard() + "', '"
                            + premiunPojo.getExpirationDate() + "', '" + premiunPojo.getCardVerificationValue() + "')";
                    statement.executeUpdate(premiunInsertsql);
                }
            }

        } catch (SQLException sqle) {
            System.out.println("Error con la BBDD - " + sqle.getMessage());
        } catch (Exception e) {
            System.out.println("Error generico - " + e.getMessage());
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
    }

}