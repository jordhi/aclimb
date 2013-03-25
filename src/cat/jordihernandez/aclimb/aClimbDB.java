package cat.jordihernandez.aclimb;

import android.provider.BaseColumns;

public class aClimbDB {
	
	//constructor per evitar instaciar la classe
	private aClimbDB() {}

	//Taula de SECTOR
	public static abstract class T_Sectors implements BaseColumns {
		public static final String TABLE_NAME = "sectors";
		public static final String COLUMN_NAME_ID = "id_sector";
		public static final String COLUMN_NAME_NOM_SECTOR = "nom_sector";
		public static final String COLUMN_NAME_COMENTARIS = "comentaris";
		public static final String COLUMN_NAME_ESCOLA = "escola";
    }
	
	// Taula d'ESCOLES
	public static abstract class T_Escoles implements BaseColumns {
		public static final String TABLE_NAME = "escoles";
		public static final String COLUMN_NAME_ID = "id_escola";
		public static final String COLUMN_NAME_NOM_ESCOLA = "nom_escola";
		public static final String COLUMN_NAME_COMENTARIS = "comentaris";
		
    }
	// Taula de VIES
	public static abstract class T_Vies implements BaseColumns {
		public static final String TABLE_NAME = "vies";
		public static final String COLUMN_NAME_ID = "id_via";
		public static final String COLUMN_NAME_NOM_VIA = "nom_escola";
		public static final String COLUMN_TIPUS = "tipus";
		public static final String COLUMN_DATA_CREACIO = "data_creacio";
		public static final String COLUMN_GRAU_ESP = "grau_esp";
		public static final String COLUMN_GRAU_CL = "grau_cl";
		public static final String COLUMN_TOPROPE = "toperope";
		public static final String COLUMN_ORIENTACIO = "orientacio";
		public static final String COLUMN_OBSERVACIONS = "observacions";
		public static final String COLUMN_DESCENS = "descens";
		public static final String COLUMN_SECTOR = "sector";
		public static final String COLUMN_ESCOLA = "escola";
    }
	
	// Taula de LLargs		
	public static abstract class T_Llargs implements BaseColumns {
		public static final String TABLE_NAME = "llargs";
		public static final String COLUMN_NAME_ID_LLARG = "id_llarg";
		public static final String COLUMN_NAME_ID_VIA = "id_via";
		public static final String COLUMN_GRAU = "grau";
		public static final String COLUMN_COMENTARIS = "comentaris";
	}
	// Taula d'Ascencions
	public static abstract class T_Ascencions implements BaseColumns {
		public static final String TABLE_NAME = "ascencions";
		public static final String COLUMN_NAME_ID_VIA = "id_via";
		public static final String COLUMN_NAME_DATA_ASC = "data_asc";
		public static final String COLUMN_FITA = "fita";
		public static final String COLUMN_COMENTARIS = "comentaris";
	}
}