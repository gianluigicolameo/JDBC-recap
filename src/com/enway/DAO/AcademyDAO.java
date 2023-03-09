package com.enway.DAO;

import com.enway.DTO.AcademyDTO;

public interface AcademyDAO {
	public void addAcademy(String sql, AcademyDTO academyDTO);
	
	public void updateAcademy(String sql, AcademyDTO academyDTO, int id);
	
	public void deleteAcademy(String sql, int id);
	
	public void readAllAcademy(String sql);
}
