package edu.lev.ymf.slam4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

import edu.lev.ymf.slam4.bo.Adresse;

public abstract class ADAO<T> {
	protected String url = "jdbc:mysql://localhost:8889/tpdao?autoReconnect=true&useSSL=false";
	protected String user = "tpdao";
	protected String pass = "tpdao";
	protected Connection connect = null;

	public ADAO() {
		try {
			this.connect = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Connexion SGBD ouverte avec succes");
	}

	/**
	 * Méthode de création d'un objet en base
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean create(T obj);

	/**
	 * Méthode pour effacer un objet en base
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean delete(T obj);

	/**
	 * Méthode de mise à jour
	 * 
	 * @param obj
	 * @return boolean
	 */
	public abstract boolean update(T obj);

	/**
	 * Méthode de recherche d'un objet
	 * 
	 * @param id
	 * @return T
	 */
	public abstract T find(int id);

	/**
	 * Méthode de recherche de tout les objets
	 * 
	 * @return T
	 */
	public abstract Vector<T> search();
}