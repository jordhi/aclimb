package cat.jordihernandez.aclimb;


import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

//AndroidFragment
public class vies extends ListFragment {

	/** An array of items to display in ArrayList */
    ArrayList<item_vies> llista_vies = new ArrayList<item_vies>();
    private manipularDadesVies dadesVies;
    
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
        /** Creating array adapter to set data in listview */
       //	ArrayList<item_vies> llista_vies = obtenirItems();
    	dadesVies = new manipularDadesVies(this.getActivity());
    	dadesVies.obrir();
    	ArrayList<item_vies> llista_vies = dadesVies.getAllVies();
    	itemViesAdapter adapter = new itemViesAdapter(this.getActivity(), llista_vies);
        
    	/** Setting the array adapter to the listview */
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
       
    }
    
    private ArrayList<item_vies> obtenirItems() {
        ArrayList<item_vies> items = new ArrayList<item_vies>();
             
        items.add(new item_vies("Crit de pànic", "7a"));
        items.add(new item_vies("Miembrillo", "6c+"));
        items.add(new item_vies("Wanted", "7a+"));
             
        return items;
      }
    @Override
    public void onStart() {
        super.onStart();
 
        /** Setting the multiselect choice mode for the listview */
        //getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
	

}
