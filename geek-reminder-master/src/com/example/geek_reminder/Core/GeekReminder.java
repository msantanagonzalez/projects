package com.example.geek_reminder.Core;

import android.app.Application;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;
import com.example.geek_reminder.R;

import static android.database.sqlite.SQLiteDatabase.*;

/**
 * Created by dario_000 on 01/12/2015.
 */
public class GeekReminder extends Application {
    private SqlIO db;

    public void onCreate(){
        super.onCreate();
        this.db=new SqlIO (this.getApplicationContext());
        //Cursor ser=db.rawQuery ("Select nombre from SERIES",null);
        /*SQLiteDatabase db = SQLiteDatabase.openDatabase("geek-reminder", null,
                SQLiteDatabase.CREATE_IF_NECESSARY | SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING
                );
        db.enableWriteAheadLogging();
*/
        Toast.makeText(getBaseContext(), "Base de datos preparada", Toast.LENGTH_LONG).show();
    }
    public SqlIO getDb(){
        Toast.makeText(getBaseContext(), "Base de datos preparada", Toast.LENGTH_LONG).show();
        return this.db;
    }

}
