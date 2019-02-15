package loic.developement.fr;

public class CarteDebit extends CartePaiement {

	protected Compte compteAssocié = new Compte();
	@Override
	public boolean autorisePaiement(int montant) {
		// TODO Auto-generated method stub
		return (compteAssocié.solde>=montant);
	}

}
