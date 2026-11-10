package gsb.modele.dao;

import gsb.modele.Medicament;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


public class MedicamentDao{

public static Medicament rechercher(String DepotLegal){
		Medicament unMedicament=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from MEDICAMENT where DEPOTLEGAL ='"+DepotLegal+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(6), reqSelection.getString(7), reqSelection.getString(8) );	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from MEDICAMENT where DEPOTLEGAL ='"+DepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}
