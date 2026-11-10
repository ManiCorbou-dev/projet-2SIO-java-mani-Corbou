package gsb.modele;

import java.sql.Date;

public class Visiteur {
	protected String matricule;
	protected String nom;
	protected String prenom;
	protected String login;
	protected String mdp;
	protected String adresse; 
	protected Localite unelocalite;
	protected String telephone;
	protected Date DateEntree;
	protected int  Prime;
	protected String codeUnite;
	protected String nomUnite;

	public Visiteur (String matricule, String nom, String prenom,
			String login,String mdp,String adresse,Localite unelocalite,String telephone,Date DateEntree,
			 int Prime,String codeUnite,String nomUnite) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.unelocalite = unelocalite;
		this.telephone = telephone;
		this.DateEntree = DateEntree;
		this.Prime = Prime;
		this.codeUnite = codeUnite;
		this.nomUnite = nomUnite;

}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Localite getUnelocalite() {
		return unelocalite;
	}

	public void setUnelocalite(Localite unelocalite) {
		this.unelocalite = unelocalite;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getDateEntree() {
		return DateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		DateEntree = dateEntree;
	}

	public int getPrime() {
		return Prime;
	}

	public void setPrime(int prime) {
		Prime = prime;
	}

	public String getCodeUnite() {
		return codeUnite;
	}

	public void setCodeUnite(String codeUnite) {
		this.codeUnite = codeUnite;
	}

	public String getNomUnite() {
		return nomUnite;
	}

	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}
