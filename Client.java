

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private ArrayList<Compte> cmpts;
	private ArrayList<Transaction> transactions;

	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;

		cmpts = new ArrayList<Compte>();
		transactions = new ArrayList<Transaction>();

	}

	void ajouterCompte(int numeroCompte, double solde, int tauxInt) {
		Compte cpt = new Compte(numeroCompte, solde, tauxInt);
		cmpts.add(cpt);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Compte> getCmpts() {
		return cmpts;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void afficherSolde(int numeroCompte) {
		if (numeroCompte > cmpts.size()) {
			System.out.println("afficherSolde > Compte introuvable ");
		} else {
              //prq numeroCompte-1?????
			System.out.println("Votre solde est : " + cmpts.get(numeroCompte-1).getSolde());
		}
	}

	public void ajouterTransaction(String date, int numeroCompte, double montant, boolean aDebiter) {
		Transaction tr = null;
		if (aDebiter) {
			tr = new Transaction(date, montant, "Debit");
			debiter(numeroCompte, montant);
		} else {
			tr = new Transaction(date, montant, "Credit ");
			crediter(numeroCompte, montant);
		}

		transactions.add(tr);
	}

	private void debiter(int numeroCompte, double montant) {

		if (numeroCompte > cmpts.size()) {
			System.out.println("debiter > Compte introuvable ");
		} else {
			if (montant > cmpts.get(numeroCompte-1).getSolde()) {
				System.out.println("Solde insuffisant.");

			} else {
				cmpts.get(numeroCompte-1).setSolde(cmpts.get(numeroCompte-1).getSolde() - montant);

			}
		}
	}

	private void crediter(int numeroCompte, double montant) {
		if (numeroCompte > cmpts.size()) {
			System.out.println("crediter > Compte introuvable ");
		} else {
			cmpts.get(numeroCompte-1).setSolde(cmpts.get(numeroCompte-1).getSolde() + montant);
		}
	}

}
