package com.example.geek_reminder.Core;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dario_000 on 03/12/2015.
 */



public class SqlIO extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "geek-reminder" ;

    private static final String TABLA_SERIES = "CREATE TABLE IF NOT EXISTS SERIES" +
            "(_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre string(255), categoria string(255))";
    private static final String TABLA_ALARMAS = "CREATE TABLE IF NOT EXISTS ALARMA" +
            "(_idA INTEGER PRIMARY KEY AUTOINCREMENT, nombreA string(255), hora string(255))";

    public SqlIO(Context context)
    {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }

   public void onOpen(SQLiteDatabase db)
    {
        db.beginTransaction();
        try {
            db.execSQL( "DELETE FROM SERIES WHERE _id IS NULL" );

            db.execSQL( "DELETE FROM ALARMA WHERE _idA IS NULL" );

            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }

        return;
    }



    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.beginTransaction();
        try{
            db.execSQL(TABLA_SERIES);
            db.execSQL(TABLA_ALARMAS);
            db.execSQL( "INSERT INTO SERIES(nombre,categoria) VALUES('ccv','hola')");
            db.execSQL( "INSERT INTO SERIES(nombre,categoria) VALUES('pco','hola')");


            db.setTransactionSuccessful();
        }finally {
            db.endTransaction();

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.beginTransaction();

        try {
            db.execSQL( "DROP TABLE IF EXISTS SERIES" );
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }

        this.onCreate( db  );

    }

    public List<Serie> getAllItems()
    {
        ArrayList<Serie> toret = new ArrayList<>();
        Cursor cursor = this.getReadableDatabase().rawQuery( "SELECT * FROM SERIES", null );
        Log.i("databse","hola");
        if ( cursor.moveToFirst() ) {
            do {
                toret.add( new Serie( cursor.getString( 1 ), cursor.getString( 2 ) ) );
                Log.i("databse","hola11");
            } while( cursor.moveToNext()  );
        }

        return toret;
    }

    public int getCountItems() {
        return this.getReadableDatabase().rawQuery( "SELECT * FROM SERIES", null ).getCount();
    }

    public void add(Serie Serie) {
        SQLiteDatabase db = this.getWritableDatabase();

        db.beginTransaction();
        try {
            db.execSQL( "INSERT INTO SERIES(nombre, categoria) VALUES(?, ?)",
                    new String[] { Serie.getNombre(), Serie.getCategoria()  } );
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }

        return;
    }



}
