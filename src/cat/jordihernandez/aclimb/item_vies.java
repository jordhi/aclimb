package cat.jordihernandez.aclimb;

public class item_vies {
	
	 protected String NomVia,Tipus,Orientacio,Descens;
	 protected String Grau;
	 protected int idvia;
	 protected int Rating;
	 protected boolean TopRope;
		 

	public item_vies() {
		// TODO Auto-generated constructor stub
		this.Grau="";
		this.NomVia="";
		this.Rating=0;
		this.Tipus="";
		this.TopRope=false;
		this.Orientacio="";
		this.Descens="";
		
	}
	
	public item_vies(String nom, String grau, int rat) {
		this.Grau=grau;
		this.NomVia=nom;
		this.Rating=rat;
	}
	
	public void setId(int id) {
		idvia = id;
	}
	
	public int getId() {
		return idvia;
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
	
	public int getRating() {
		return Rating;
	}

	public void setRating(int rat) {
		this.Rating = rat;
	}
	
	public String getTipus() {
		return Tipus;
	}
	
	public void setTipus(String tip) {
		this.Tipus = tip;
	}		 
	
	public String getOrientacio() {
		return Orientacio;
	}
	
	public void setOrientacio(String ori) {
		this.Orientacio = ori;
	}		 
	
	public void setTopRope(boolean t) {
		this.TopRope = t;
	}
	
	public boolean getTopRope() {
		return TopRope;
	}
	
	public String getDescens() {
		return Descens;
	}
	
	public void setDescens(String des) {
		this.Descens = des;
	}
		     
}
