package com.scray.insoftar.service;

import java.util.List;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.stereotype.Repository;

import com.scray.insoftar.beans.Persona;
import com.scray.insoftar.dao.ScraySession;

@Repository
@Transactional
public class DAOPersonaImp implements DAOPersona {

	private ScraySession scraySession;

	public DAOPersonaImp() {
		this.scraySession = new ScraySession();
	}

	public List<Persona> findAllPersona() {
		return scraySession.getSession().createQuery("from Persona").list();
	}

	public Persona findPersona(String correo) {
		try {
			System.out.println("entro aca");
			return (Persona) scraySession.getSession().createQuery("from Persona where correo = " + correo)
					.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

	public void insertarPersona(Persona persona) {
		scraySession.getSession().persist(persona);
		if (scraySession.getSession().getTransaction().equals(TransactionStatus.ACTIVE)) {
			scraySession.getSession().getTransaction().commit();
		}

	}

	public void updatePersona(Persona persona) {
		System.out.println(persona.toString());
		scraySession.getSession().merge(persona);
		if (scraySession.getSession().getTransaction().equals(TransactionStatus.ACTIVE)) {
			scraySession.getSession().getTransaction().commit();
		}

	}
}
