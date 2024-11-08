package com.ensa.exam2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
    private Connection con;
    private Statement st;
    public Connexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/control2020","control2020","root");
        st=con.createStatement();
        System.out.println("Connected to the database");
    }
    public Connection getCon() {
        return con;
    }
    public Statement getSt(){
        return st;

    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connexion connexion=new Connexion();

        connexion.getCon().close();
    }


}
