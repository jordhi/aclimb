package cat.jordihernandez.aclimb;

public class item_vies {
	
	 protected String NomVia;
	 protected String Grau;
	 

	public item_vies() {
		// TODO Auto-generated constructor stub
		this.Grau="";
		this.NomVia="";
	}
	public item_vies(String nom, String grau) {
		this.Grau=grau;
		this.NomVia=nom;
	}
	
	public String getNomVia() {
		return NomVia;
	}
	
	public void setNomVia(String nom) {
		this.NomVia = nom;
	}	
		         
	public String getGrau() {
		return Grau;
	}
	
	public void setGrau(String grau) {
		this.Grau = grau;
	}		 
		     
}
