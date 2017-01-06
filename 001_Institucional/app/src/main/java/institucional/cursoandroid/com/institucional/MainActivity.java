package institucional.cursoandroid.com.institucional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static institucional.cursoandroid.com.institucional.R.id.ivAEmpresaId;
import static institucional.cursoandroid.com.institucional.R.id.ivServicosId;

public class MainActivity extends AppCompatActivity {
    private ImageView ivAEmpresa;
    private ImageView ivServicos;
    private ImageView ivClientes;
    private ImageView ivContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAEmpresa = (ImageView) findViewById(ivAEmpresaId);
        ivServicos = (ImageView) findViewById(ivServicosId);
        ivClientes = (ImageView) findViewById(R.id.ivClientesId);
        ivContato = (ImageView) findViewById(R.id.ivContatoId);

        ivAEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AEmpresaActivity.class));
            }
        });

        ivServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicosActivity.class));
            }
        });

        ivClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        ivContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
    }
}