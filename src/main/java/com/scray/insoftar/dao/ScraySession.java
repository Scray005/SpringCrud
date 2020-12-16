package com.scray.insoftar.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ScraySession {
	private Session session;
	public ScraySession() {
	    Configuration config = new Configuration();
	    config.configure();
	    SessionFactory sesionFactory  = config.buildSessionFactory();
	    session = sesionFactory.openSession();
	    session.beginTransaction();
	}
	public Session getSession() {
		return session;
	}
}
