package com.enway.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.enway.DTO.AcademyDTO;
import com.enway.VO.AcademyVO;
import com.enway.VO.UtenteVO;
import com.enway.connection.ConnectionManager;

public class AcademyDAOImpl implements AcademyDAO{

	@Override
	public void addAcademy(String sql, AcademyDTO academyDTO) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, academyDTO.getAcademyCode());
			ps.setString(2, academyDTO.getSubject());
			ps.setInt(3, academyDTO.getNumberOfStudents());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateAcademy(String sql, AcademyDTO academyDTO, int id) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setString(1, academyDTO.getAcademyCode());
			ps.setString(2, academyDTO.getSubject());
			ps.setInt(3, academyDTO.getNumberOfStudents());
			ps.setInt(4, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteAcademy(String sql, int id) {
		PreparedStatement ps = ConnectionManager.getPreparedStatement(sql);
		try {
			ps.setInt(1, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readAllAcademy(String sql) {
		AcademyVO academyVO = null;
		
		ResultSet rs = ConnectionManager.getResultSet(sql);
		
		try {
			while(rs.next()) {
				academyVO= new AcademyVO(rs.getInt("id"),
							rs.getString("academy_code"), 
							rs.getString("subject"), 
							rs.getInt("number_of_students"));
				System.out.println(academyVO.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
