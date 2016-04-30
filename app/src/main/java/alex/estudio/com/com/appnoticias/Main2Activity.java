package alex.estudio.com.com.appnoticias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button noticiaAudi;
    private Button noticiaBentley;
    private Button noticiaLexus;
    private Button noticiaPorsche;
    private Button noticiaJaguar;
    private Button noticiaAuditt;
    private ImageButton volver;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        noticiaAudi = (Button)findViewById(R.id.noticiaAudi);
        noticiaBentley = (Button)findViewById(R.id.noticiaBentley);
        noticiaLexus = (Button)findViewById(R.id.noticiaLexus);
        noticiaPorsche = (Button)findViewById(R.id.noticiaPorsche);
        noticiaJaguar = (Button)findViewById(R.id.noticiaJaguar);
        noticiaAuditt = (Button)findViewById(R.id.noticiaAuditt);
        volver = (ImageButton)findViewById(R.id.volver);
        noticiaAudi.setOnClickListener(this);
        noticiaBentley.setOnClickListener(this);
        noticiaLexus.setOnClickListener(this);
        noticiaPorsche.setOnClickListener(this);
        noticiaJaguar.setOnClickListener(this);
        noticiaAuditt.setOnClickListener(this);
        volver.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //Creacion de la variable Intent para acceder a las diferentes noticias
        Intent i;

        if (v.getId() == volver.getId()){

            System.exit(0);
        }
        if (v.getId() == noticiaAudi.getId()){
             i = new Intent(this,NoticiaPrimera.class);
             startActivity(i);
        }
        if (v.getId() == noticiaBentley.getId()){
             i = new Intent(this,NoticiaBentley.class);
             startActivity(i);
        }
        if (v.getId() == noticiaLexus.getId()){
             i = new Intent(this,NoticiaLexus.class);
             startActivity(i);
        }
        if (v.getId() == noticiaPorsche.getId()){
             i = new Intent(this,NoticiaPorsche.class);
             startActivity(i);
        }
        if (v.getId() == noticiaJaguar.getId()){
             i = new Intent(this,NoticiaJaguar.class);
             startActivity(i);
        }
        if (v.getId() == noticiaAuditt.getId()){
             i = new Intent(this,NoticiaAuditt.class);
             startActivity(i);
        }


}
}
