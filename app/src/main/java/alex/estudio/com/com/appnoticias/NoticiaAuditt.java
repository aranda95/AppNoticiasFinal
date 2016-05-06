package alex.estudio.com.com.appnoticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaAuditt extends AppCompatActivity implements View.OnClickListener {
    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoAuditt;
    private ImageView imagen;
    public int[] imagenes = {R.drawable.auditt, R.drawable.auditt2, R.drawable.auditt3};
    private int posicion = 0, posicionFinal = imagenes.length - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticiaauditt);
        atras = (ImageButton) findViewById(R.id.atrasAudi);
        adelante = (ImageButton) findViewById(R.id.imageButton4);
        menu = (ImageButton) findViewById(R.id.menu);
        textoAuditt = (TextView) findViewById(R.id.textoAuditt);
        imagen = (ImageView) findViewById(R.id.imagen);
        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);
        textoAuditt.setText("Nuevo Audi TT RS, aterriza con nueva tecnología y 400 caballos de potencia" +
                "\n" +
                "La firma de los cuatro aros finalmente ha desvelado el nuevo Audi TT RS, la versión más radical del modelo alemán. Llevamos varios meses hablando de esta novedad y de lo que podríamos esperar de ella y por fin se ha hecho oficial. El nuevo RS de la familia TT enseña un diseño más deportivo, incorpora la última tecnología de la casa y monta un potente motor heredado de su hermano el RS3 con el que eroga nada menos que 400 caballos de potencia. Ha sido desvelado en el Salón de Pekín y se muestra tanto en carrocería Coupé como en Roadster.\n" +
                "\n" +
                "Hace unas semanas os lo anunciábamos, el Audi TT RS podría llegar antes de lo esperado. Los pronósticos se han confirmado, mostrándose en la muestra china de este año. Si bien el nuevo TT RS luce, como todos los miembros de la familia RS, un aspecto más extremo y musculado gracias a los paragolpes de diseño más agresivo, el difusor trasero, el alerón y la dos salidas de escape de generosas dimensiones que caracterizan a estas variantes.\n" +
                "\n" +
                "Por último el apartado mecánico nos deja un motor de 2.5 litros y cinco cilindros heredado del Audi RS3 capaz de declarar una potencia final de 400 CV y 480 Nm de par. Las cifras se han mejorado notablemente con respecto al RS3 ya que este ultimo se conforma con 367 caballos de potencia. Con la llegada del nuevo TT RS el cambio manual desaparece, estando disponible únicamente para acompañar a este motor una caja de cambios automática de doble embrague con siete relaciones S tronic. Una novedad que no agradará a los más puristas.\n" +
                "\n" +
                "Lo que si agrada a cualquiera son las cifras de rendimiento. El Audi TT RS Coupé declara una aceleración de 0-100 km/h de solo 3,7 segundos, empleando 0,2 segundos más la versión Roadster del modelo. La velocidad máxima es de 250 o 280 km/h dependiendo de la versión, aunque en cualquier caso está limitada electrónicamente. Por supuesto la tracción total quattro de la marca llega de serie, elevando la efectividad de la variante.\n" +
                "\n");
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
