package loic.developement.fr;

public class CarteCr�dit extends CartePaiement {

	protected int plafond;
	protected int encours;
	
	
	@Override
	public boolean autorisePaiement(int montant) {
		
		return(encours+montant<=plafond);
		
	}

	
	
}
