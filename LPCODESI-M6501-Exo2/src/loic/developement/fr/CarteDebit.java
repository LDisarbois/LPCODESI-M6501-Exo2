package loic.developement.fr;

public class CarteDebit extends CartePaiement {

	protected Compte compteAssociť = new Compte();
	@Override
	public boolean autorisePaiement(int montant) {
		// TODO Auto-generated method stub
		return (compteAssociť.solde>=montant);
	}

}
