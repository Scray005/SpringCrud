package com.scray.insoftar.service;	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scray.insoftar.beans.Persona;

@Service
public class PersonaServiceImp{
	
	@Autowired
	private DAOPersona daoPersona;
	
	
	public void insertarPersona(Persona persona) {
		daoPersona.insertarPersona(persona);
	}

	public List<Persona> findAllPersona() {
		return daoPersona.findAllPersona();
	}


	public void updatePersona(Persona persona) {
		daoPersona.updatePersona(persona);
		
	}
	
	public Persona findPersona(String correo) {
		return daoPersona.findPersona(correo);
	}
}