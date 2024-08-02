package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération  */
	private double tauxRemuneration;

	public LivretA( double solde, double tauxRemuneration) {
		super("LA", solde, 0);
		this.tauxRemuneration =tauxRemuneration;
	}
	public void appliquerRemuAnnuelle(){
		double nouveauSolde = this.getSolde() + this.getSolde() *tauxRemuneration/100;
			this.setSolde(nouveauSolde);
	}

	/** Getter pour le taux de rémunération
	 * @return le taux de rémunération
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter pour le taux de rémunération
	 * @param tauxRemuneration le nouveau taux de rémunération
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
