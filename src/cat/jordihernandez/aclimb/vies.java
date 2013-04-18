package cat.jordihernandez.aclimb;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//AndroidFragment
public class vies extends ListFragment {

	/** An array of items to display in ArrayList */
    ArrayList<item_vies> llista_vies = new ArrayList<item_vies>();
    private manipularDadesVies dadesVies;
    
 
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
    
   
   
	

}
