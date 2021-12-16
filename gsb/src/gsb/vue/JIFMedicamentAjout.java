package gsb.vue;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.event.ActionListener;

public class JIFMedicamentAjout extends JIFMedicament implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton ajouter;

	public JIFMedicamentAjout() {
		super();
		ajouter = new JButton("Ajouter");
		pBoutons.add(ajouter);
		// déclaration des sources d'évènements
		ajouter.addActionListener(this);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setTitle("Ajout d'un Medicament");

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
			ajoutMedicament();
		}
	}
} // fin actionPerformed
