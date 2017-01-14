package signos.cursoandroid.com.minhasanotacoes;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private TextView txt;
    private ImageView salvar;

    private static final String NOME_ARQUIVO = "anotacao.txt";

    private void writeFile(String textoDigitado) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(NOME_ARQUIVO, MODE_PRIVATE));
            outputStreamWriter.write(textoDigitado);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.v("MainActivity", e.toString());
        }
    }

    @NonNull
    private String readFile() {
        String texto = "";

        try {
            InputStream arquivo = openFileInput(NOME_ARQUIVO);

            if(arquivo != null) {
                InputStreamReader isr = new InputStreamReader(arquivo);
                BufferedReader br = new BufferedReader(isr);

                String linha;
                while ((linha = br.readLine()) != null) {
                    texto += linha;
                }
            }
        } catch (IOException e) {
            Log.v("MainActivity", e.toString());
        }
        return texto;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById(R.id.txtId);
        salvar = (ImageView) findViewById(R.id.salvarId);

        txt.setText(readFile());

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeFile(txt.getText().toString());
            }
        });
    }
}
