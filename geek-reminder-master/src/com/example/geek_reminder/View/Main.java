package com.example.geek_reminder.View;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
//import com.example.geek_reminder.Core.SqlIO;
import com.example.geek_reminder.Core.GeekReminder;
import com.example.geek_reminder.Core.Serie;
import com.example.geek_reminder.Core.SqlIO;
import com.example.geek_reminder.R;

import java.util.List;

//import static com.example.geek_reminder.Core.SqlIO.*;

public class Main extends Activity {
    public final static int NEW_SERIE = 101;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SqlIO sqlDb =((GeekReminder) this.getApplication()).getDb();
        //SQLiteDatabase db = sqlDb.getWritableDatabase();

        getActionBar().setDisplayUseLogoEnabled(true);
        getActionBar().setDisplayShowCustomEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
        //Toast.makeText(getBaseContext(), "Base de datos preparada", Toast.LENGTH_LONG).show();
        //getActionBar().setHomeButtonEnabled(true);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        Button AltaSerie = (Button) this.findViewById( R.id.serie );
        Button ListarSerie = (Button) this.findViewById( R.id.listar );
        Button AltaAlarma = (Button) this.findViewById( R.id.alarma );

        ListarSerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main.this, ListarSerie.class );
                intent.putExtra( "x", "Ppal lanza Subactividad1" );
                Main.this.startActivity( intent );
            }
        });

        AltaSerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSerie();
               // Intent intent = new Intent( Main.this, AltaSerie.class );
                //Main.this.startActivity( intent );
            }
        });

        AltaAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main.this, AltaAlarma.class );
                Main.this.startActivity( intent );
            }
        });





    }
    private void addSerie() {
        this.startActivityForResult( new Intent( this, AltaSerie.class ), NEW_SERIE );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu( menu );

        this.getMenuInflater().inflate( R.menu.main_properties, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        super.onOptionsItemSelected( menuItem );

        switch( menuItem.getItemId() ) {
            case R.id.main_properties_add:
                Intent intent = new Intent( Main.this, AltaSerie.class );
                Main.this.startActivity( intent );
               // Main.this.addNewMortgage();
                break;
            case R.id.main_properties_back:
                Main.this.finish();
                break;
        }

        return true;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        super.onActivityResult( requestCode, resultCode, intent );

        if ( resultCode == RESULT_OK ) {
            ListView lItems = (ListView) this.findViewById( R.id.listaSerie );

            if ( requestCode == NEW_SERIE ) {
                SqlIO db = ( (GeekReminder) this.getApplication() ).getDb();

                Serie serie = new Serie(
                        intent.getExtras().getString( AltaSerie.ETQ_Nom ),
                        intent.getExtras().getString( AltaSerie.ETQ_cat ) );

                db.add( serie );
                this.listItems.add( serie );
                ( (ArrayAdapter) lItems.getAdapter() ).notifyDataSetChanged();
            }
        }

        return;
    }

    List<Serie> listItems;

}
