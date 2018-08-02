

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		Client c1 = new Client("Ali", "Salim");
		c1.ajouterCompte(1, 1000, 1);
		c1.ajouterCompte(2, 5000, 2);

		Client c2 = new Client("Alia", "Salima");
		c2.ajouterCompte(1, 2000, 1);
		c2.ajouterCompte(2, 4000, 2);

		c1.afficherSolde(2);
		c2.afficherSolde(1);

		c1.ajouterTransaction("20-10-2017", 2, 25000, false);
		c1.ajouterTransaction("22-10-2017", 1, 35000, false);
		c1.ajouterTransaction("27-10-2017", 2, 45000, false);
		c1.ajouterTransaction("28-10-2017", 2, 15000, true);
		c1.afficherSolde(2);

		// afficher les transaction du client 1
		ArrayList<Transaction> transactionsC1 = c1.getTransactions();
		for (int i = 0; i < transactionsC1.size(); i++) {
			System.out.println(transactionsC1.get(i));
		}

		// ...

	}
}
