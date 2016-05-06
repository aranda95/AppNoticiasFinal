package alex.estudio.com.com.appnoticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaJaguar extends AppCompatActivity implements View.OnClickListener {
    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoJaguar;
    private ImageView imagen;
    public int[] imagenes = {R.drawable.jaguar1, R.drawable.jaguar2, R.drawable.jaguar3};
    private int posicion = 0, posicionFinal = imagenes.length - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticiajaguar);
        atras = (ImageButton) findViewById(R.id.atrasAudi);
        adelante = (ImageButton) findViewById(R.id.imageButton4);
        menu = (ImageButton) findViewById(R.id.menu);
        textoJaguar = (TextView) findViewById(R.id.textoJaguar);
        imagen = (ImageView) findViewById(R.id.imagen);
        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);
        textoJaguar.setText("Jaguar XFL, la alternativa británica a las berlinas de batalla larga" +
                "\n" +
                "\nTal y como estaba previsto, los británicos han aprovechado el Salón de Pekín para dar a conocer el Jaguar XFL, la versión de batalla larga del Jaguar XF que se venderá exclusivamente en el mercado chino. La alternativa británica tendrá que rivalizar con modelos como el Mercedes Clase E de batalla larga, que también ha debutado en Pekín." +
                "\n" +
                "\nLa batalla de este Jaguar XFL crece 140 mm hasta alcanzar los 3,1 metros, lo que proporciona una habitabilidad mucho mayor a los ocupantes de las plazas traseras. La longitud total del Jaguar XF de batalla larga se incrementa hasta los 5,09 metros. Las diferencias estéticas con respecto a la versión de batalla corta se limitan a una puerta trasera más larga y el cambio no resulta tan evidente como en el Mercedes Clase E." +
                "\n" +
                "\nLos pasajeros de las plazas traseras se beneficiarán del sistema de advertencia que avisa cuando un vehículo se aproxima, evitando que pueda colisionar con la puerta del vehículo o, pero aún, atropellar al pasajero que está saliendo del coche.");
    }
            public void metodoatras(){
                if (posicion <= 0) {
                    posicion = posicionFinal;
                } else {
                    posicion = posicion - 1;
                }
                imagen.setImageResource(imagenes[posicion]);
            }
            public void metodoadelante(){
                if (posicion >= posicionFinal) {
                    posicion = 0;
                } else {
                    posicion = posicion + 1;
                }
                imagen.setImageResource(imagenes[posicion]);
            }

    @Override
    public void onClick(View v) {
        if (v.getId() == menu.getId()) {
            System.exit(0);
        }
        if (v.getId() == atras.getId()){
            metodoatras();
        }
        if (v.getId() == adelante.getId()){
            metodoadelante();
        }
    }
}
