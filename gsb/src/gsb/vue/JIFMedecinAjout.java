package gsb.vue;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class JIFMedecinAjout extends JIFMedecin implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton ajouter;
	private ArrayList<Medecin> lesMedecins;
	private int indiceEnCours;

	public JIFMedecinAjout() {
		super();
		ajouter = new JButton("Ajouter");
		pBoutons.add(ajouter);
		// déclaration des sources d'évènements
		ajouter.addActionListener(this);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("Ajout d'un medecin");

		// récupération des données Medecin dans la collection
		lesMedecins = MedecinDao.retournerCollectionDesMedecins();
		indiceEnCours = 0;

		// ajout d'un écouteur d'évènement pour la fermeture de la fenêtre
		addInternalFrameListener(new InternalFrameAdapter() {
			public void internalFrameClosing(InternalFrameEvent e) {
				// le code que tu veux exécuter à la fermeture de la JInternalFrame
			}
		});
	}

	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		if (source == ajouter) {

			Medecin leMedecin = lesMedecins.get(indiceEnCours);
			remplirText(leMedecin);
		}
	}
} // fin actionPerformed
