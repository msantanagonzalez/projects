package com.example.geek_reminder.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.example.geek_reminder.Core.GeekReminder;
import com.example.geek_reminder.Core.Serie;
import com.example.geek_reminder.Core.SerieAdapter;
import com.example.geek_reminder.R;

import java.util.List;

/**
 * Created by dario_000 on 01/12/2015.
 */
public class ListarSerie extends Activity {
    List<Serie> listItems;
    ListView listview;

    public void onCreate(Bundle data) {
        super.onCreate(data);
        setContentView(R.layout.listar_serie);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        //ListView lItems = (ListView) this.findViewById( R.id.listaSerie );
        Log.i("databse","lista");
        listview = (ListView) findViewById(R.id.listaSerie);
        listview.setAdapter(new SerieAdapter(this, new String[] { "data1",
                "data2" }));

        Log.i("databse","lista2");
        this.listItems = ( (GeekReminder) this.getApplication() ).getDb().getAllItems();Log.i("databse","comprobacionlista");
        /*
        lItems.setAdapter( new SerieAdapter(

                this,
                android.R.layout.simple_expandable_list_item_1,
                this.listItems

        ) );*/
       



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
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            case R.id.main_properties_add:
                Intent intent = new Intent( ListarSerie.this, AltaSerie.class );
                ListarSerie.this.startActivity( intent );
                // Main.this.addNewMortgage();
                break;
            case R.id.main_properties_back:
                ListarSerie.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
