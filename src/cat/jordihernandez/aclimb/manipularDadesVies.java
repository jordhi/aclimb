/* Classe per fer operacions sobre la taula de vies */

package cat.jordihernandez.aclimb;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class manipularDadesVies {
	
	private SQLiteDatabase bdClimb;
	private aClimbDBHelper dbHelper;
	//private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
	//      MySQLiteHelper.COLUMN_COMMENT };
	
	public manipularDadesVies(Context context) {
		// TODO Auto-generated constructor stub
		dbHelper = new aClimbDBHelper(context);
	}
	
	public void obrir() throws SQLException {
		//obrim la bd en mode escriptura
	    bdClimb = dbHelper.getWritableDatabase();
	}

	public void tancar() {
	    dbHelper.close();
	}
	
	public void inserirVia(item_vies via_nova) {
		    ContentValues values = new ContentValues();
		    values.put(aClimbDB.T_Vies.COLUMN_NAME_ID, via_nova.getId());
		    values.put(aClimbDB.T_Vies.COLUMN_NAME_NOM_VIA, via_nova.getNomVia());
		    values.put(aClimbDB.T_Vies.COLUMN_GRAU_ESP, via_nova.getGrau());
		    long insertId = bdClimb.insert(aClimbDB.T_Vies.TABLE_NAME, null,
		        values);
		   /* Cursor cursor = bdClimb.query(aClimbDB.T_Vies.TABLE_NAME,
		        allColumns, MySQLiteHelper.COLUMN_ID + " = " + insertId, null,
		        null, null, null);
		    cursor.moveToFirst();
		    Comment newComment = cursorToComment(cursor);
		    cursor.close();
		    return newComment;*/
		  }
	
	public ArrayList<item_vies> getAllVies() {
	    ArrayList<item_vies> vies = new ArrayList<item_vies>();

	    Cursor cursor = bdClimb.query(aClimbDB.T_Vies.TABLE_NAME,
	        null , null, null, null, null, null);

	    cursor.moveToFirst();
	    while (!cursor.isAfterLast()) {
	      item_vies via = cursorToVies(cursor);
	      vies.add(via);
	      cursor.moveToNext();
	    }
	    // Make sure to close the cursor
	    cursor.close();
	    return vies;
	  }
	
	 private item_vies cursorToVies(Cursor cursor) {
		    item_vies via = new item_vies();
		    via.setId(cursor.getInt(0));
		    via.setNomVia(cursor.getString(1));
		    via.setGrau(cursor.getString(4));
		    return via;
		  }

}
