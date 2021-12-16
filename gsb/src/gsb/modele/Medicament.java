package gsb.modele;

public class Medicament {
	protected String code;
	protected String libelle;
	protected String depotLegal;
	protected String nom;
	protected String composition;
	protected String effets;
	protected String contreIndic;
	protected float prix;

	/**
	 * @param code
	 * @param libelle
	 * @param depotLegal
	 * @param nom
	 * @param composition
	 * @param effets
	 * @param contreIndic
	 * @param prix
	 */
	public Medicament(String depotLegal, String nom, String composition, String effets, String contreIndic, Float prix,
			String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
		this.nom = nom;
		this.depotLegal = depotLegal;
		this.composition = composition;
		this.effets = effets;
		this.contreIndic = contreIndic;
		this.prix = prix;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDepotLegal() {
		return depotLegal;
	}

	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getEffets() {
		return effets;
	}

	public void setEffets(String effets) {
		this.effets = effets;
	}

	public String getContreIndic() {
		return contreIndic;
	}

	public void setContreIndic(String contreIndic) {
		this.contreIndic = contreIndic;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
