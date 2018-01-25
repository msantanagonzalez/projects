package com.example.geek_reminder.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import com.example.geek_reminder.R;

/**
 * Created by dario_000 on 01/12/2015.
 */
public class AltaAlarma extends Activity {

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.alta_alarma);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);


        EditText serieA = (EditText) this.findViewById(R.id.serieAlarma);
        EditText holaAlarma = (EditText) this.findViewById(R.id.horaAlarma);





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

                Intent intent = new Intent( AltaAlarma.this, AltaSerie.class );
                AltaAlarma.this.startActivity( intent );
                // Main.this.addNewMortgage();
                break;
            case R.id.main_properties_back:
                AltaAlarma.this.finish();
                break;
            default:

        }
        return super.onOptionsItemSelected(item);
    }
}
