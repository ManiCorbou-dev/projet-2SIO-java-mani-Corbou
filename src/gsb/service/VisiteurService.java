package gsb.service;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class VisiteurService {
	
	public static Visiteur rechercherVisiteur(String unmatricule){
		Visiteur unVisiteur = null;
		try{
		if (unmatricule==null) {
            throw new Exception("Donnee obligatoire : code");
        }
		unVisiteur = VisiteurDao.rechercher(unmatricule);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unVisiteur;
	}
	
}