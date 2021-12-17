package gsb.tests;

import gsb.modele.Medicament;
import gsb.service.MedicamentService;

public class MedicamentServiceTest {
	public static void main(String[] args) {
	Medicament unMedicament = MedicamentService.rechercherMedicament("3MYC7");
	System.out.println("nom: " +unMedicament.getNom());
	System.out.println("Depot legal: " +unMedicament.getDepotLegal());
	System.out.println("Code: " +unMedicament.getCode());
	System.out.println("Composition: " +unMedicament.getComposition());
	System.out.println("Effets: " +unMedicament.getEffets());
	System.out.println("Contre indication: " +unMedicament.getContreIndic());
	System.out.println("Prix: " +unMedicament.getPrix());
	System.out.println("Libelle: " +unMedicament.getLibelle());
	}
}
