package cat.jordihernandez.aclimb;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
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

}
