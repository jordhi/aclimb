package cat.jordihernandez.aclimb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;

public class formulariVies extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_vies);
		EditText txtvia;
		Spinner spOrientacio;
		
		//disseny del spinner
		spOrientacio = (Spinner)this.findViewById(R.id.cmbOrientacio);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_orientacio, android.R.layout.simple_spinner_item);
		spOrientacio.setAdapter(adapter);
		
		//fem que entrar el nom de la via sigui en primer valor a entrar
		txtvia = (EditText)this.findViewById(R.id.txtNomVia);
		txtvia.requestFocus();
				
	}

	public void InserirDades (View view) {
		EditText txtvia,txtgrau;
		RatingBar rating;
		Spinner spOrientacio;
		RadioGroup optTipus;
		RadioButton tipus;
		int TipusSel;
		
		
		
		txtvia = (EditText)this.findViewById(R.id.txtNomVia);
		txtgrau = (EditText)this.findViewById(R.id.txtGrau);
		rating = (RatingBar)this.findViewById(R.id.ratQualitat);
		optTipus = (RadioGroup)this.findViewById(R.id.rgrpEspClas);
		spOrientacio = (Spinner)this.findViewById(R.id.cmbOrientacio);
				
		manipularDadesVies dvies = new manipularDadesVies(this);
		dvies.obrir();
		// Agafar les dades dels widgets
		item_vies via_nova = new item_vies(txtvia.getText().toString(),txtgrau.getText().toString(),(int)rating.getRating());
		
		TipusSel = optTipus.getCheckedRadioButtonId();
		tipus = (RadioButton)this.findViewById(TipusSel);
		via_nova.setTipus(tipus.getText().toString());
		
		via_nova.setOrientacio(spOrientacio.getSelectedItem().toString());
		
		
		// Inserir a la base de dades i tancar
		dvies.inserirVia(via_nova);
		dvies.tancar();
		
		finish();
		
	}
	
	public void CancelarNovaVia (View view) {
		finish();
		
	}

}
