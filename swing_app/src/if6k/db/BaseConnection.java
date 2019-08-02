/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if6k.db;
import java.sql.*;

/**
 *
 * @author shancheas
 */
public abstract class BaseConnection {
    private final static String DB_HOST = "jdbc:mysql://localhost/";
    private final static String DB_USER = "root";
    private final static String DB_PASS = "";
    private final static String DB_NAME = "db_kontrakan";
    
    protected Connection conn;
    protected Statement state;
    protected ResultSet result;
    
    public BaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_HOST + DB_NAME, DB_USER, DB_PASS);
            state = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected abstract String tableName();
    
    public ResultSet getAll() throws SQLException {
        String query = "SELECT * FROM " + tableName();
        return state.executeQuery(query);
    }
    
    public ResultSet get(int id) throws SQLException {
        String query = "SELECT * FROM " + tableName() + " WHERE id = " + id;
        return state.executeQuery(query);
    }
    
    public ResultSet find(String field, String value) throws SQLException {
        String query = "SELECT * FROM " + tableName() + " WHERE " + field + " LIKE %" + value + "%";
        return state.executeQuery(query);
    }
    
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM " + tableName() + " WHERE id = " + id;
        state.executeQuery(query);
    }
    
}
