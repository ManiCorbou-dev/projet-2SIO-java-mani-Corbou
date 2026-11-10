package gsb.service;

import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class LocaliteService {
	
	public static Localite rechercherLocalite(String uncode){
		Localite uneLocalite = null;
		try{
		if (uncode==null) {
            throw new Exception("Donnee obligatoire : code");
        }
		uneLocalite = LocaliteDao.rechercher(uncode);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return uneLocalite;
	}
	
}