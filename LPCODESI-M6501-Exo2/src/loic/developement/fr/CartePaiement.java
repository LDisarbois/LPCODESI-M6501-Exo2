package loic.developement.fr;

public abstract class CartePaiement {

	public void payeAchat(int montant) {
		
	}
	
	public abstract boolean autorisePaiement(int montant);
	
	
}
