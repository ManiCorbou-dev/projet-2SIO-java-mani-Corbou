package gsb.modele;

import java.sql.Date;

public class Medicament {
	protected String DepotLegal;
	protected String nomCommercial;
	protected String Composition;
	protected String Effets;
	protected String ContreIndication;
	protected float PrixEchantillon;
	protected String codeFamille;
	protected String libellefamille;
	
	public Visiteur (String DepotLegal, String nomCommercial, String Composition,
			String Effets,String ContreIndication,float PrixEchantillon,String codeFamille,String libellefamille) {
		this.DepotLegal = DepotLegal;
		this.nomCommercial = nomCommercial;
		this.Composition = Composition;
		this.Effets = Effets;
		this.ContreIndication = ContreIndication;
		this.PrixEchantillon = PrixEchantillon;
		this.codeFamille = codeFamille;
		this.libellefamille = libellefamille; 

	

}

	public String getDepotLegal() {
		return DepotLegal;
	}

	public void setDepotLegal(String depotLegal) {
		DepotLegal = depotLegal;
	}

	public String getNomCommercial() {
		return nomCommercial;
	}

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}

	public String getComposition() {
		return Composition;
	}

	public void setComposition(String composition) {
		Composition = composition;
	}

	public String getEffets() {
		return Effets;
	}

	public void setEffets(String effets) {
		Effets = effets;
	}

	public String getContreIndication() {
		return ContreIndication;
	}

	public void setContreIndication(String contreIndication) {
		ContreIndication = contreIndication;
	}

	public float getPrixEchantillon() {
		return PrixEchantillon;
	}

	public void setPrixEchantillon(float prixEchantillon) {
		PrixEchantillon = prixEchantillon;
	}

	public String getCodeFamille() {
		return codeFamille;
	}

	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille;
	}

	public String getLibellefamille() {
		return libellefamille;
	}

	public void setLibellefamille(String libellefamille) {
		this.libellefamille = libellefamille;
	}
}
