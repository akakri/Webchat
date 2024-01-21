package database;

import java.sql.*;
import java.util.ArrayList;

public class Databasehandler {
    public final Datab datab = new Datab();

    public Databasehandler() {
    }

    public Boolean register(String username, String password){
        Connection con = this.datab.connect();
        try {
            PreparedStatement prep = con.prepareStatement("INSERT INTO user VALUES(?,?)");
            prep.setString(1, username);
            prep.setString(2,password);
            prep.execute();
            return true;
        } catch (SQLException e) {
            return false;
        }

    }
    public String sendMessage(String username,String message){
        Connection con = this.datab.connect();
        try {
            PreparedStatement prep = con.prepareStatement("INSERT INTO message VALUES(?,?)");
            prep.setString(1, username);
            prep.setString(2,message);
            prep.execute();
            return "Message successfully sent";
        } catch (SQLException e) {
            return "Message failed to send";
        }
    }
    public ArrayList<String> receiveMessage(String username) throws SQLException {
        ArrayList<String> arr = new ArrayList<>();
        Connection con = this.datab.connect();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from message where username = '" + username+"'");
        while(rs.next()){
            String a = rs.getString(2);
            arr.add(a);
        }
        return arr;
    }
    public boolean validLogin(String username,String password) throws SQLException {
        Connection con = this.datab.connect();
        Statement stmt = con.createStatement();
        boolean b = false;
        ResultSet rs = stmt.executeQuery("select * from user");
        while (rs.next()){
            if(rs.getString(1).equals(username) & rs.getString(2).equals(password)){
                b=true;
            }
        }
        return b;
    }
}
