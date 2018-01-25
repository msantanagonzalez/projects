package com.example.geek_reminder.View;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.geek_reminder.Core.GeekReminder;
import com.example.geek_reminder.Core.SqlIO;
import com.example.geek_reminder.R;

/**
 * Created by dario_000 on 01/12/2015.
 */
public class AltaSerie extends Activity {
    public static final String ETQ_Nom = "nombre";
    public static final String ETQ_cat = "categoria";

    public void onCreate(Bundle data) {
        super.onCreate(data);
        setContentView(R.layout.alta_serie);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        EditText serie = (EditText) this.findViewById(R.id.serie);
        EditText categoria = (EditText) this.findViewById(R.id.categoria);
        EditText fecha = (EditText) this.findViewById(R.id.fecha);

        Button alta = (Button) findViewById(R.id.alta);


        alta.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                //Editable nombre = serie.getText();
                //String categoria1 = categoria.getText() ;

                if ( !serie.getText().toString().isEmpty())
                {
                    atencion();
                    atencion();
                    alta(100,serie.getText().toString(),categoria.getText().toString());

                    AltaSerie.this.finish();
                } else {
                    AltaSerie.this.setResult( RESULT_CANCELED );
                    AltaSerie.this.finish();
                }
            }
        } );




    }
    public void alta(int x,String A,String B){
        SqlIO sqlDb = ( (GeekReminder) this.getApplication() ).getDb();
        SQLiteDatabase db = sqlDb.getWritableDatabase();
        //db.execSQL( "INSERT INTO SERIES(_id,nombre,categoria) VALUES(200,"A","B")");

        ContentValues nuevoRegistro = new ContentValues();
        //nuevoRegistro.put("_id", "12255222898");
        nuevoRegistro.put("nombre",A);
        nuevoRegistro.put("categoria",B);

//Insertamos el registro en la base de datos
        db.insert("SERIES", null, nuevoRegistro);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu( menu );

        this.getMenuInflater().inflate( R.menu.main_properties, menu );
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;

            case R.id.main_properties_add:
                Intent intent = new Intent( AltaSerie.this, AltaSerie.class );
                AltaSerie.this.startActivity( intent );
                // Main.this.addNewMortgage();
                break;
            case R.id.main_properties_back:
                AltaSerie.this.finish();
                break;
            default:

        }
        return super.onOptionsItemSelected(item);
    }

    public void atencion(){
        Toast.makeText(this,"Funciona boton",Toast.LENGTH_LONG).show();
    }
}
