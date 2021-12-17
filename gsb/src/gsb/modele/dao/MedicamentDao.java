package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Medicament;

public class MedicamentDao {
	public static Medicament rechercher(String codeMedicament) {
		Medicament unMedicament = null;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from Medicament where MED_DEPOTLEGAL ='" + codeMedicament + "'");
		try {
			if (reqSelection.next()) {
				unMedicament = new Medicament(reqSelection.getString(1), reqSelection.getString(2),
						reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5),
						reqSelection.getFloat(6), reqSelection.getString(7), reqSelection.getString(8));
			}
			;
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Medicament where MED_DEPOTLEGAL ='"
					+ codeMedicament + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}

	public static ArrayList<Medicament> retournerCollectionDesMedicaments() {
		ArrayList<Medicament> collectionDesMedicaments = new ArrayList<Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MED_DEPOTLEGAL from Medicament");
		try {
			while (reqSelection.next()) {
				String codeMedicament = reqSelection.getString(1);
				collectionDesMedicaments.add(MedicamentDao.rechercher(codeMedicament));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesMedicaments()");
		}
		return collectionDesMedicaments;
	}

	public static HashMap<String, Medicament> retournerDictionnaireDesMedicaments() {
		HashMap<String, Medicament> diccoDesMedicaments = new HashMap<String, Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MED_DEPOTLEGAL from Medicament");
		try {
			while (reqSelection.next()) {
				String depotMedicament = reqSelection.getString(1);
				diccoDesMedicaments.put(depotMedicament, MedicamentDao.rechercher(depotMedicament));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedicaments()");
		}
		return diccoDesMedicaments;
	}

	public static int ajoutMedicament(String depotLegal, String nom, String composition, String effets,
			String contreIndic, Float prix, String code, String libelle) {

		if(depotLegal.isBlank()) {
			System.out.println("Un medicament doit avoir au moins un Depot légal pour pouvoir être ajouté");
			return 0;
		}
		else if(rechercher(depotLegal) != null) {
			System.out.println("Le Depot legal donné est déja present dans la base de données");
			return 0;
		}
		int res = ConnexionMySql.execReqMaj(" INSERT INTO MEDICAMENT VALUES ('" +depotLegal+ "','" +nom+ "','" +composition+ "','" +effets+ "','" +contreIndic+ "'," +prix+ ",'" +code+ "','" +libelle+"') ");
	return res;

	}
}
