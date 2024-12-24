
public class ProduitElectronique extends Produit{
	
	private int puissance;

	public ProduitElectronique(String nom, double prix, int quantity, int puissance) {
		super(nom, prix, quantity);
		this.puissance = puissance;
	}
	
	@Override
	public void afficherDetails() {
		// TODO Auto-generated method stub
		super.afficherDetails();
		System.out.println(" Puissance : "+this.puissance+" W");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
