import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Produit> ListProduit;

	public Stock(List<Produit> listProduit) {
		super();
		this.ListProduit = new ArrayList<>();
	}
	public void ajouterProduit(Produit p){
		ListProduit.add(p);
	}
	public void afficherTousLesProduits(){
		// TODO Auto-generated method stub
		for (Produit p : ListProduit) {
			p.afficherDetails();
			System.out.println();
		}

	}
	public void calculerValeurTotaleStock() {
		// TODO Auto-generated method stub
		for (Produit p : ListProduit) {
			double total = p.getPrix()*p.getQuantity();
			System.out.println("Total : "+total+" DH");
			
		}

	}
	public void mettreAJourQuantite(String nom, int nouvelleQuantite) {
		for (Produit p : ListProduit) {
			if (p.getNom().equalsIgnoreCase(nom)) {
				p.setQuantity(nouvelleQuantite);
				
			}
			
		}
	}
	public void augmenterQuantitePourcentage(String nom, double pourcentage) {
		for (Produit p : ListProduit) {
			if (p.getNom().equalsIgnoreCase(nom)) {
				int QuantityPourcentage= (int) (p.getQuantity()*(1+pourcentage/100));
				p.setQuantity(QuantityPourcentage);
				return;
				
			}
		}
	}
	
}
	
	
	
	


