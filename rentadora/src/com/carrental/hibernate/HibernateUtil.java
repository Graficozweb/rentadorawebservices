package com.carrental.hibernate;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 *  
 * @author rentadora 05/05/2011
 * @version 1.0
 */
public class HibernateUtil {

	
	private static final SessionFactory sessionFactory;
	
    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	//File f = new File("/resources/hibernate.cfg.xml");
        	//System.out.println(f.exists());
            sessionFactory = new Configuration().configure("com/carrental/hibernate/hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        } 
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
