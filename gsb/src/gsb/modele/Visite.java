package gsb.modele;

public class Visite {
	protected String codeMed;
	protected String matricule;
	protected String reference;
	protected String dateVisite;
	protected String commentaire;

	/**
	 * @param codeMed
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param laLocalite
	 */
	public Visite(String codeMed, String matricule, String reference, String dateVisite, String commentaire) {
		this.codeMed = codeMed;
		this.codeMed = codeMed;
		this.matricule = matricule;
		this.reference = reference;
		this.dateVisite = dateVisite;
		this.commentaire = commentaire;
	}

	/**
	 * @return the codeMed
	 */
	public String getCodeMed() {
		return codeMed;
	}

	/**
	 * @param codeMed the codeMed to set
	 */
	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}

	/**
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @return the dateVisite
	 */
	public String getDateVisite() {
		return dateVisite;
	}

	/**
	 * @param dateVisite the dateVisite to set
	 */
	public void setDateVisite(String dateVisite) {
		this.dateVisite = dateVisite;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
