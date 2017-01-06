package signos.cursoandroid.com.signos;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvSignos;

    private String[] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião",
            "Sargitário", "Capricórnio", "Aquário", "Peixes"
    };

    private String[] caracteristicasSignos = {
            "Áries é muito...", "Touro é muito...", "Gêmeos é muito...", "Câncer é muito...",
            "Leão é muito...", "Virgem é muito...", "Libra é muito...", "Escorpião é muito...",
            "Sargitário é muito...", "Capricórnio é muito...", "Aquário é muito...",
            "Peixes é muito..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSignos = (ListView) findViewById(R.id.lvSignosId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos);

        lvSignos.setAdapter(adapter);

        lvSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        caracteristicasSignos[position],
                        Toast.LENGTH_SHORT)
                    .show();
            }
        });
    }
}