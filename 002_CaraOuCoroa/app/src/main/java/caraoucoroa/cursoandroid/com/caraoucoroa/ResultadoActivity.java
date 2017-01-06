package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView ivMoeda;
    private ImageView ivVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ivVoltar = (ImageView) findViewById(R.id.ivVoltarId);

        ivVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));
            }
        });

        ivMoeda = (ImageView) findViewById(R.id.ivMoedaId);

        Bundle b = getIntent().getExtras();

        if (b != null) {
            boolean cara = b.getBoolean("cara");
            
            if (cara)
                ivMoeda.setBackgroundResource(R.drawable.moeda_cara);
            else
                ivMoeda.setBackgroundResource(R.drawable.moeda_coroa);
        }
    }
}
