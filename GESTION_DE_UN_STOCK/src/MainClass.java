
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProduitAlimentaire produit1=new ProduitAlimentaire("pro1", 13, 10, 5);
		ProduitElectronique produit2=new ProduitElectronique("pro2", 19, 12, 1800);
		Produit produit3=new Produit("pro3", 50, 5);
		
		Stock stock= new Stock(null);
		stock.ajouterProduit(produit1);
		System.out.println();
		stock.ajouterProduit(produit2);
		System.out.println();
		stock.ajouterProduit(produit3);
		System.out.println();
		stock.afficherTousLesProduits();
		System.out.println();
		stock.calculerValeurTotaleStock();
		System.out.println();
		stock.mettreAJourQuantite("pro1", 40);
		System.out.println();
		stock.calculerValeurTotaleStock();
		System.out.println();
		stock.augmenterQuantitePourcentage("pro2", 20);
		System.out.println();
		stock.afficherTousLesProduits();
		
	

	}

}
