package cat.jordihernandez.aclimb;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

<<<<<<< HEAD

public class escoles extends ListFragment {

	
	 ArrayList<item_escoles> llista_escoles = new ArrayList<item_escoles>();
	 private manipularDadesEscoles dadesEscoles;
	 
	 /** An array of items to display in ArrayList */
    
=======
//AppleFragment
public class escoles extends ListFragment {

	
	 ArrayList<item_escoles> llista_vies = new ArrayList<item_escoles>();
	// private manipularDadesEscoles dadesEscoles;
	 
	 /** An array of items to display in ArrayList */
    String llista_escoles[] = new String[]{
        "Sadernes",
        "Bellavista",
        "Montgrony",
        "Gombrèn",
        "Ogassa",
        "Montserrat",
        "Calders",
        "Solius"
    };
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
<<<<<<< HEAD
       ObtenirLlistaEscoles();
       return super.onCreateView(inflater, container, savedInstanceState);
    }
    
    public void ObtenirLlistaEscoles() {
    	
   	 /** Creating array adapter to set data in listview */
     dadesEscoles = new manipularDadesEscoles(this.getActivity());
   	 dadesEscoles.obrir();
   	
   	 llista_escoles = dadesEscoles.getAllEscoles();
     itemEscolesAdapter adapter = new itemEscolesAdapter(this.getActivity(), llista_escoles);
       
     /** Setting the array adapter to the listview */
     setListAdapter(adapter);
       
      //tanquem la bbdd
      dadesEscoles.tancar();
   }
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		this.ObtenirLlistaEscoles();
		super.onResume();
	}
    
=======
        /** Creating array adapter to set data in listview */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice, llista_escoles);
 
        /** Setting the array adapter to the listview */
        setListAdapter(adapter);
 
        return super.onCreateView(inflater, container, savedInstanceState);
    }
 
    @Override
    public void onStart() {
        super.onStart();
 
        /** Setting the multiselect choice mode for the listview */
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
>>>>>>> 928dbe4adf1c96b187b39e49c0051ab8ef3695a8

}
