package cat.jordihernandez.aclimb;

import android.os.Bundle;
import android.view.View;

public class formulariEditarVies extends formulariVies {
	int idvia;
	item_vies via;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Bundle reicieveParams = getIntent().getExtras();
	    idvia = reicieveParams.getInt("idvia");
	    
	    //recuperar dades de la via idvia provinent del item sel.lecionat
	    manipularDadesVies dvies = new manipularDadesVies(this);
		dvies.obrir();
		
		via = dvies.SeleccioVia(idvia);
		this.txtvia.setText(via.getNomVia());
		this.txtgrau.setText(via.getGrau());
		//this.spOrientacio.
		String stipus = via.getTipus().toString();
		if(stipus.equalsIgnoreCase("Clàssica")) {
			//Mostrar camp Descens si la via és clàssica
			this.txtDescens.setVisibility(View.VISIBLE);
            this.lblDescens.setVisibility(View.VISIBLE);
            this.txtDescens.setText(via.getDescens());
		}
		this.TopRope.setChecked(via.getTopRope());
		this.rating.setRating(via.getRating());
		
		//FALTEN AQUESTS DOS
		this.spOrientacio.setSelection(3);
		this.tipus.setChecked(true);
		
		dvies.tancar();
	    
		
	    
	}

	@Override
	public void InserirDades(View view) {
		// TODO Auto-generated method stub
		super.InserirDades(view);
	}
	
}
