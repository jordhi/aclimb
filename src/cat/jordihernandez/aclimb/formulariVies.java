package cat.jordihernandez.aclimb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;

public class formulariVies extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_vies);
		EditText txtvia;
		txtvia = (EditText)this.findViewById(R.id.txtNomVia);
		txtvia.requestFocus();
				
	}

	public void InserirDades (View view) {
		EditText txtvia,txtgrau,txtTipus;
		RatingBar rating;
		Spinner spOrientacio;
		
		
		txtvia = (EditText)this.findViewById(R.id.txtNomVia);
		txtgrau = (EditText)this.findViewById(R.id.txtGrau);
		rating = (RatingBar)this.findViewById(R.id.ratQualitat);
		txtTipus = (EditText)this.findViewById(R.id.txtTipus);
		spOrientacio = (Spinner)this.findViewById(R.id.cmbOrientacio);
		
		manipularDadesVies dvies = new manipularDadesVies(this);
		dvies.obrir();
		// Agafar les dades dels widgets
		item_vies via_nova = new item_vies(txtvia.getText().toString(),txtgrau.getText().toString(),(int)rating.getRating());
		via_nova.setTipus(txtTipus.getText().toString());
		via_nova.setOrientacio("Nord");
		
		
		// Inserir a la base de dades i tancar
		dvies.inserirVia(via_nova);
		dvies.tancar();
		
		finish();
		
	}
	
	public void CancelarNovaVia (View view) {
		finish();
		
	}

}
