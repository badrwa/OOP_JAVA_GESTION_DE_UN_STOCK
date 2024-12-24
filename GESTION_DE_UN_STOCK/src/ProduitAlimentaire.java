
public class ProduitAlimentaire extends Produit{

	private double poids;

	public ProduitAlimentaire(String nom, double prix, int quantity, double poids) {
		super(nom, prix, quantity);
		this.poids = poids;
	}
	
	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		super.afficherDetails();
		System.out.println(" Poids : "+this.poids+" Kg");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
