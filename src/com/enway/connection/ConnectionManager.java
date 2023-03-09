package com.enway.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectionManager implements ConnectionParameters{
	public static Connection openConnection() {
		
		Connection con = null;
		try {
			Class.forName(driverConnection);

			con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Errore");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erorre Motrael");
		}
		return con;
	}
	
	public static PreparedStatement getPreparedStatement(String sql) {
		PreparedStatement ps = null;
		
		try {
			ps = openConnection().prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erorre Motrael");
		}

		return ps;
	}
	
	public static ResultSet getResultSet(String sqlRead) {
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = openConnection().createStatement();
			rs = st.executeQuery(sqlRead);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erorre Motrael");
		} 
		return rs;
	}
	
	public static void closeConnection() {
		try {
			openConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erorre Motrael");
		}
	}
}
