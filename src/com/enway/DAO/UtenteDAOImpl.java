package com.enway.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.enway.DTO.UtenteDTO;
import com.enway.VO.UtenteVO;
import com.enway.connection.ConnectionManager;

public class UtenteDAOImpl implements utenteDAO{
	public void addUtente(String sql, UtenteDTO utenteDTO) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, utenteDTO.getFirstName());
			ps.setString(2, utenteDTO.getLastName());
			ps.setInt(3, utenteDTO.getAge());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateUtente(String sql, UtenteDTO utenteDTO, int id) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, utenteDTO.getFirstName());
			ps.setString(2, utenteDTO.getLastName());
			ps.setInt(3, utenteDTO.getAge());
			ps.setInt(4, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteUtente(String sql, int id) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readAllUtente(String sql) {
		UtenteVO utenteVO = null;
		
		ResultSet rs = ConnectionManager.getResultSet(sql);
		
		try {
			while(rs.next()) {
				utenteVO= new UtenteVO(rs.getInt("id"),
							rs.getString("first_name"), 
							rs.getString("last_name"), 
							rs.getInt(0));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
