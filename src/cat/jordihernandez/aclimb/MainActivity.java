package cat.jordihernandez.aclimb;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends Activity {
	
	private TabHost mHost;
    LocalActivityManager lam;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
                
        mHost = (TabHost) findViewById(android.R.id.tabhost);
        
        
        lam = new LocalActivityManager(MainActivity.this, false);
        lam.dispatchCreate(savedInstanceState);
 
        mHost.setup(lam);
        
        Intent intent1 = new Intent(this, vies.class);
        spec = mHost.newTabSpec("vies").setIndicator("", res.getDrawable(R.drawable.icon_vies_tab)).setContent(intent1);
        mHost.addTab(spec);
        
        
        Intent intent2 = new Intent(this, escoles.class);
        spec = mHost.newTabSpec("escoles").setIndicator("",res.getDrawable(R.drawable.icon_escoles_tab)).setContent(intent2);
        mHost.addTab(spec);
        
        mHost.setCurrentTab(0);
    }

    @Override
    protected void onPause() {
       lam.dispatchPause(isFinishing());
       super.onPause();
    }
    @Override
    protected void onResume() {
        lam.dispatchResume();
        super.onResume();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
