package com.scray.insoftar.service;

import java.util.List;

import com.scray.insoftar.beans.Persona;


public interface DAOPersona {
	public List<Persona> findAllPersona();
	public void insertarPersona(Persona persona);
	public void updatePersona(Persona persona);
	public Persona findPersona(String correo);

}
