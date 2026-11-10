package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

/**
 * TODO Pour changer le modeele de ce commentaire de type genere, allez :
 * Fenetre - Preferences - Java - Style de code - Modeles de code
 */
public class MedicamentService {
	
	public static Medicament rechercherMedicament(String undepotlegal){
		Medicament unMedicamnent = null;
		try{
		if (undepotlegal==null) {
            throw new Exception("Donnee obligatoire : code");
        }
		unMedicamnent = MedicamentDao.rechercher(undepotlegal);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedicamnent;
	}
	
}
