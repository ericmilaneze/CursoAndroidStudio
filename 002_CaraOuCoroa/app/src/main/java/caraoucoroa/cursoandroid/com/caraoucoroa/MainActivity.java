package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView ivJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivJogar = (ImageView) findViewById(R.id.ivJogarId);

        ivJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int rdVal = rd.nextInt(2);

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("cara", rdVal == 0);

                startActivity(intent);
            }
        });
    }
}
