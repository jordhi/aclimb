package cat.jordihernandez.aclimb;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class formulariVies extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form_vies);
	}

	public void InserirDades (View view) {
		EditText txtvia,txtgrau;
		txtvia = (EditText)this.findViewById(R.id.txtNomVia);
		txtgrau = (EditText)this.findViewById(R.id.txtGrau);
		
		manipularDadesVies dvies = new manipularDadesVies(this);
		dvies.obrir();
		// Agafar les dades dels widgets
		item_vies via_nova = new item_vies(txtvia.getText().toString(),txtgrau.getText().toString());
		// Inserir a la base de dades i tancar
		dvies.inserirVia(via_nova);
		dvies.tancar();
		
		finish();
		
	}

}
