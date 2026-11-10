package gsb.modele.dao;

import gsb.modele.Visiteur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


public class VisiteurDao{

public static Visiteur rechercher(String matricule){
		Visiteur unVisiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE ='"+matricule+"'");
		try {
			if (reqSelection.next()) {
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(6), reqSelection.getString(7), reqSelection.getString(8) );	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from VISITEUR where MATRICULE ='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}