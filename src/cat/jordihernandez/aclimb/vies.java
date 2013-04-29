package cat.jordihernandez.aclimb;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

//AndroidFragment
public class vies extends ListFragment {

	/** An array of items to display in ArrayList */
    ArrayList<item_vies> llista_vies = new ArrayList<item_vies>();
    private manipularDadesVies dadesVies;
    //itemViesAdapter vista_llista;
    
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         
    	return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void ObtenirLlistaVies() {
    	
    	 /** Creating array adapter to set data in listview */
        dadesVies = new manipularDadesVies(this.getActivity());
    	dadesVies.obrir();
    	ArrayList<item_vies> llista_vies = dadesVies.getAllVies();
    	itemViesAdapter adapter = new itemViesAdapter(this.getActivity(), llista_vies);
        
    	/** Setting the array adapter to the listview */
        setListAdapter(adapter);
        
        //tanquem la bbdd
        dadesVies.tancar();
    }

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		ObtenirLlistaVies();
		super.onResume();
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		MenuInflater inflater = this.getActivity().getMenuInflater();
	    inflater.inflate(R.menu.mcont_vies, menu);

	}

	
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		Toast toast = new Toast(this.getActivity());
		
		switch(item.getItemId()) {
	    case R.id.esborrar_item:
	    	toast.makeText(this.getActivity(), "esborrar", Toast.LENGTH_SHORT).show();
	    	break;
	    case R.id.editar_item:
	    	toast.makeText(this.getActivity(), "editar", Toast.LENGTH_SHORT).show();
	        break;
	    }
	    
		
		return super.onContextItemSelected(item);
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		registerForContextMenu(getListView());
	}
    
   

}
