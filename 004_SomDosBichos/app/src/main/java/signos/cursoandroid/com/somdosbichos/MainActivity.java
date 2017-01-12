package signos.cursoandroid.com.somdosbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivCao;
    private ImageView ivGato;
    private ImageView ivLeao;
    private ImageView ivMacaco;
    private ImageView ivOvelha;
    private ImageView ivVaca;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivCao = (ImageView)findViewById(R.id.ivCaoId);
        ivGato = (ImageView)findViewById(R.id.ivGatoId);
        ivLeao = (ImageView)findViewById(R.id.ivLeaoId);
        ivMacaco = (ImageView)findViewById(R.id.ivMacacoId);
        ivOvelha = (ImageView)findViewById(R.id.ivOvelhaId);
        ivVaca = (ImageView)findViewById(R.id.ivVacaId);

        ivCao.setOnClickListener(this);
        ivGato.setOnClickListener(this);
        ivLeao.setOnClickListener(this);
        ivMacaco.setOnClickListener(this);
        ivOvelha.setOnClickListener(this);
        ivVaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivCaoId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.cao);
                mp.start();
                break;
            case R.id.ivGatoId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.gato);
                mp.start();
                break;
            case R.id.ivLeaoId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.leao);
                mp.start();
                break;
            case R.id.ivMacacoId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                mp.start();
                break;
            case R.id.ivOvelhaId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                mp.start();
                break;
            case R.id.ivVacaId:
                mp = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                mp.start();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        if (mp != null) {
            mp.release();
            mp = null;
        }

        super.onDestroy();
    }
}
