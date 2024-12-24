
public class Produit {

	private String nom;
	private double prix;
	private int quantity;
	public Produit(String nom, double prix, int quantity) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.quantity = quantity;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void afficherDetails(){
		System.out.println("Nom : "+this.nom
				+" Prix : "+this.prix
				+" Quantity : "+this.quantity);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
