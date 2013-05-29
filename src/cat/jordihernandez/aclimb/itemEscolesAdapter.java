package cat.jordihernandez.aclimb;

import java.util.ArrayList;

import android.app.Activity;
<<<<<<< HEAD
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
=======
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8

public class itemEscolesAdapter extends BaseAdapter {
	protected Activity activity;
	protected ArrayList<item_escoles> items;
	
<<<<<<< HEAD
	public itemEscolesAdapter(Activity activity, ArrayList<item_escoles> items) {
		// TODO Auto-generated constructor stub
		this.activity = activity;
	    this.items = items;
=======
	public itemEscolesAdapter() {
		// TODO Auto-generated constructor stub
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return items.size();
=======
		return 0;
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return items.get(position);
=======
		return null;
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return position;
=======
		return 0;
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		View vi=convertView;
        
	    if(convertView == null) {
	      LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	      vi = inflater.inflate(R.layout.list_item_view_escoles, null);
	    }
	             
	    item_escoles item = items.get(position);
	         
	    //ImageView image = (ImageView) vi.findViewById(R.id.imgSpinnerOri);
	    //int imageResource = activity.getResources().getIdentifier(item.getRutaImagen(), null, activity.getPackageName());
	    //image.setImageDrawable(activity.getResources().getDrawable(imageResource));
	         
	    TextView nombre = (TextView) vi.findViewById(R.id.txtNomEscola);
	    nombre.setText(item.getNomEscola() + " id:" + item.getId());
	         
	    TextView comentari = (TextView) vi.findViewById(R.id.txtNumVies);
	    comentari.setText("N vies");
	       
	    return vi;
=======
		return null;
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
	}

}
