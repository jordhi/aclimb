package cat.jordihernandez.aclimb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TabHost;
 
public class MainActivity extends FragmentActivity {
    TabHost tHost;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        aClimbDBHelper mDbHelper = new aClimbDBHelper(getBaseContext());
        SQLiteDatabase dbC = mDbHelper.getWritableDatabase();
        dbC.close();
        
        tHost = (TabHost) findViewById(android.R.id.tabhost);
        tHost.setup();
 
        /** Defining Tab Change Listener event. This is invoked when tab is changed */
        TabHost.OnTabChangeListener tabChangeListener = new TabHost.OnTabChangeListener() {
 
            @Override
            public void onTabChanged(String tabId) {
                android.support.v4.app.FragmentManager fm =   getSupportFragmentManager();
                vies _vies = (vies) fm.findFragmentByTag("vies");
                escoles _escoles = (escoles) fm.findFragmentByTag("escoles");
                android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
 
                /** Detaches the fragment vies if exists */
                if(_vies!=null)
                    ft.detach(_vies);
 
                /** Detaches the fragment escoles if exists */
                if(_escoles!=null)
                    ft.detach(_escoles);
 
                /** If current tab is vies */
                if(tabId.equalsIgnoreCase("vies")){
 
                    if(_vies==null){
                        /** Create vies and adding to fragmenttransaction */
                        ft.add(R.id.tabVies,new vies(), "vies");
                    }else{
                        /** Bring to the front, if already exists in the fragmenttransaction */
                        ft.attach(_vies);
                    }
 
                }else{    /** If current tab is apple */
                    if(_escoles==null){
                        /** Create escoles and adding to fragmenttransaction */
                        ft.add(R.id.TabEscoles,new escoles(), "escoles");
                     }else{
                        /** Bring to the front, if already exists in the fragmenttransaction */
                        ft.attach(_escoles);
                    }
                }
                ft.commit();
            }
        };
 
        /** Setting tabchangelistener for the tab */
        tHost.setOnTabChangedListener(tabChangeListener);
 
        /** Defining tab builder for Andriod tab */
        TabHost.TabSpec tSpecVies = tHost.newTabSpec("vies");
        tSpecVies.setIndicator("Vies",getResources().getDrawable(R.drawable.icon_vies_tab));
        tSpecVies.setContent(new ContingutsTabHost(getBaseContext()));
        tHost.addTab(tSpecVies);
 
        /** Defining tab builder for Apple tab */
        TabHost.TabSpec tSpecEscoles = tHost.newTabSpec("escoles");
        tSpecEscoles.setIndicator("Escoles",getResources().getDrawable(R.drawable.icon_escoles_tab));
        tSpecEscoles.setContent(new ContingutsTabHost(getBaseContext()));
        tHost.addTab(tSpecEscoles);
 
    }
}