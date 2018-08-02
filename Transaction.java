

public class Transaction {
	private String date;
	private double montant;
	private String typeTransaction;

	public Transaction(String date, double montant, String typeTransaction) {
		this.date = date;
		this.montant = montant;
		this.typeTransaction = typeTransaction;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public String toString() {

		return date + " | montant : " + montant + " | type transaction : " + typeTransaction;

	}

}
