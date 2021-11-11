package Reiziger;

import java.sql.*;


public class ReizigerDAOPsql {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ovchip", "postgres", "bluun123")) {
            System.out.println("Verbonden met database!");
            Statement statement = connection.createStatement();

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }



}








//public class ReizigerDAOPsql {
//    private Integer reiziger_id;
//    private String voorletters;
//    private String tussenvoegsels;
//    private String achternaam;
//    private Date geboortedatum;
//
//    public int getreiziger_id() {
//        return reiziger_id;
//    }
//
//    public void setId(int id) {
//        this.reiziger_id = id;
//    }
//
//    public String getVoorletters() {
//        return voorletters;
//    }
//
//    public void setVoorletters(String voorletters) {
//        this.voorletters = voorletters;
//    }
//
//    public String getTussenvoegsels(){
//        return tussenvoegsels;
//    }
//
//    public void setTussenvoegsels(){
//        this.tussenvoegsels = tussenvoegsels;
//    }
//
//    public String getAchternaam(){
//        return achternaam;
//    }
//
//    public void setAchternaam(){
//        this.achternaam = achternaam;
//    }
//
//    public Date getGeboortedatum(){
//        return geboortedatum;
//    }
//
//    public void setGeboortedatum(){
//        this.geboortedatum = geboortedatum;
//    }
//
//}


