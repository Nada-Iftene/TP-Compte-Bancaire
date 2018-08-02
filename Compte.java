

public class Compte {
	private int numeroCompte;
	private double solde;
	private int tauxInt;

	public Compte(int numeroCompte, double solde, int tauxInt) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.tauxInt = tauxInt;
	}

	// getters and setters
	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getTauxInt() {
		return tauxInt;
	}

	public void setTauxInt(int tauxInt) {
		this.tauxInt = tauxInt;
	}

}
