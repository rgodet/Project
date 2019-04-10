/**
 * 
 */
package edu.lev.ymf.slam4.bo;

import java.util.Date;

import edu.lev.ymf.slam4.dao.ADAO;

/**
 * @author ymf
 *
 */
public class Personne {
	/**
		 * @author ymf
		 *
		 */

	private int id = -1;
	private String nom;
	private String prenom;
	private Date naissance;
	private Adresse adresse;
	
	/**
	 * @param nom
	 * @param prenom
	 * @param naissance
	 * @param adresse
	 */
	public Personne(String nom, String prenom, Date naissance, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.adresse = adresse;
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param naissance
	 * @param adresse
	 */
	public Personne(int id, String nom, String prenom, Date naissance, Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.adresse = adresse;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the naissance
	 */
	public Date getNaissance() {
		return naissance;
	}
	/**
	 * @param naissance the naissance to set
	 */
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String toString() {
		return "([" + this.id + "] - " + this.nom + " - " + this.prenom + " - " + this.naissance + " - " + this.adresse + ")";
	}

}
