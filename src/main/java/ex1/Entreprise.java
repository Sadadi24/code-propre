

package ex1;


import java.util.Date;

public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;

	public static final int CAPITAL_MAX = 3000000;

	// Constructeur
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	// Getters et Setters
	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}

	// Méthode pour afficher les détails de l'entreprise
	public void afficherStatut() {
		System.out.println("Nom de l'entreprise: " + nom);
		System.out.println("Numéro SIRET: " + siret);
		System.out.println("Adresse: " + adresse);
		System.out.println("Date de création: " + dateCreation);
	}
}
