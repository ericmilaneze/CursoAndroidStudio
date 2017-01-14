package signos.cursoandroid.com.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView nome;
    private Button salvar;

    private static final String ARQUIVO_PREFERENCIA = "arquivo_preferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (TextView) findViewById(R.id.nomeId);
        salvar = (Button) findViewById(R.id.salvarId);

        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, MODE_PRIVATE);

        nome.setText(sharedPreferences.getString("nome", ""));

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nome.getText().toString().equals("")) {
                    Toast.makeText(
                            MainActivity.this,
                            "Por favor, preencha o nome.",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCIA, MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    editor.putString("nome", nome.getText().toString());
                    editor.commit();
                }
            }
        });
    }
}
