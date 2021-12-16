package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb.modele.Medicament;

public class JIFMedicament extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	protected JPanel p;
	protected JPanel pTexte;
	protected JPanel pBoutons;

	protected JLabel JLcode;
	protected JLabel JLLibelle;
	protected JLabel JLDepotLegal;
	protected JLabel JLNom;
	protected JLabel JLComposition;
	protected JLabel JLEffets;
	protected JLabel JLContreIndic;
	protected JLabel JLPrix;;

	protected JTextField JTCode;
	protected JTextField JTLibelle;
	protected JTextField JTDepotLegal;
	protected JTextField JTNom;
	protected JTextField JTComposition;
	protected JTextField JTContreIndic;
	protected JTextField JTEffets;
	protected JTextField JTPrix;

	public JIFMedicament() {
		p = new JPanel(); // panneau principal de la fenêtre
		pBoutons = new JPanel(); // panneau supportant les boutons
		pTexte = new JPanel(new GridLayout(8, 2));

		JLDepotLegal = new JLabel("Depot Legal");
		JLcode = new JLabel("Code");
		JLNom = new JLabel("Nom");
		JLLibelle = new JLabel("Libelle");
		JLComposition = new JLabel("Composition");
		JLEffets = new JLabel("Effets");
		JLContreIndic = new JLabel("Contre Indice");
		JLPrix = new JLabel("prix");

		JTDepotLegal = new JTextField(20);
		JTCode = new JTextField(20);
		JTCode.setMaximumSize(JTCode.getPreferredSize());
		JTNom = new JTextField(20);
		JTLibelle = new JTextField(20);
		JTComposition = new JTextField(20);
		JTEffets = new JTextField(20);
		JTContreIndic = new JTextField(20);
		JTPrix = new JTextField(20);

		pTexte.add(JLDepotLegal);
		pTexte.add(JTDepotLegal);
		pTexte.add(JLcode);
		pTexte.add(JTCode);
		pTexte.add(JLNom);
		pTexte.add(JTNom);
		pTexte.add(JLLibelle);
		pTexte.add(JTLibelle);
		pTexte.add(JLComposition);
		pTexte.add(JTComposition);
		pTexte.add(JLEffets);
		pTexte.add(JTEffets);
		pTexte.add(JLContreIndic);
		pTexte.add(JTContreIndic);
		pTexte.add(JLPrix);
		pTexte.add(JTPrix);

		// mise en forme de la fenêtre

		p.add(pTexte);
		p.add(pBoutons);
		Container contentPane = getContentPane();
		contentPane.add(p);

	}

	public void remplirText(Medicament unMedicament) { // méthode qui permet de remplir les zones de texte à partir des
														// valeurs passées en paramètres
		JTDepotLegal.setText(unMedicament.getDepotLegal());
		JTNom.setText(unMedicament.getNom());
		JTComposition.setText(unMedicament.getComposition());
		JTEffets.setText(unMedicament.getEffets());
		JTContreIndic.setText(unMedicament.getContreIndic());
		JTPrix.setText(Float.toString(unMedicament.getPrix()));
		JTCode.setText(unMedicament.getCode());
		JTLibelle.setText(unMedicament.getLibelle());
	}

	public void viderText() { // méthode qui permet de vider les zones de texte
		JTDepotLegal.setText("");
		JTNom.setText("");
		JTComposition.setText("");
		JTEffets.setText("");
		JTContreIndic.setText("");
		JTPrix.setText("");
		JTCode.setText("");
		JTLibelle.setText("");
	}

	public void ajoutMedicament() {
		
		String depotLegal = JTDepotLegal.getText();
		String nom = JTNom.getText();
		String Composition = JTComposition.getText();
		String effets = JTEffets.getText();
		String contreIndic = JTContreIndic.getText();
		String code = JTCode.getText();
		String libelle = JTLibelle.getText();
		Float prix;
		if(JTPrix.getText().isEmpty()) { //on met la valeur de prix a null manuellement si le texte est vide car parseFLoat() ne fonctionne pas avec des string vide
			prix = null;
		}
		else {
			prix = Float.parseFloat(JTPrix.getText());
		}
		int result = gsb.modele.dao.MedicamentDao.ajoutMedicament(depotLegal, nom, Composition, effets, contreIndic, prix, code,
				libelle);
		if(result > 0) {
			System.out.println("La requéte a été correctement ajouté");
		}
		else {
			System.out.println("la requéte n'a pas été correctement ajouté");
		}
		
	}
	//transforme une String en un string vide si la valeur est null

}
