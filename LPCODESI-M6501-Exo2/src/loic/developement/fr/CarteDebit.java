package loic.developement.fr;

public class CarteDebit extends CartePaiement {

	protected Compte compteAssoci� = new Compte();
	@Override
	public boolean autorisePaiement(int montant) {
		// TODO Auto-generated method stub
		return (compteAssoci�.solde>=montant);
	}

}
