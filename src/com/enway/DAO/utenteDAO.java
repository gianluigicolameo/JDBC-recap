package com.enway.DAO;

import com.enway.DTO.UtenteDTO;

public interface utenteDAO {
	
	public void addUtente(String sql, UtenteDTO utenteDTO);
	
	public void updateUtente(String sql, UtenteDTO utenteDTO, int id);
	
	public void deleteUtente(String sql, int id);
	
	public void readAllUtente(String sql);
	
}
