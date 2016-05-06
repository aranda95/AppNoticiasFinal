package alex.estudio.com.com.appnoticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaLexus extends AppCompatActivity implements View.OnClickListener {
    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoLexus;
    private ImageView imagen;
    public int[] imagenes = {R.drawable.lexus1, R.drawable.lexus2, R.drawable.lexus3};
    private int posicion = 0, posicionFinal = imagenes.length - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticialexus);
        atras = (ImageButton) findViewById(R.id.atrasAudi);
        adelante = (ImageButton) findViewById(R.id.imageButton4);
        menu = (ImageButton) findViewById(R.id.menu);
        textoLexus = (TextView) findViewById(R.id.textoLexus);
        imagen = (ImageView) findViewById(R.id.imagen);
        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);
        textoLexus.setText("Lexus IS 2016, nuevo aspecto exterior y mejoras en el interior con los mismos motores" +
                "\n" +
                "\nLexus está en el Salón del Automóvil de Pekín, donde ha presentado el nuevo Lexus IS 2016. Se trata del restyling de mitad de ciclo comercial de su berlina de segmento D, que fue lanzada al mercado en 2013. Los cambios estéticos son los más apreciables en este restyling, que actualiza por completo el frontal del Lexus IS, pero siempre manteniendo esa personalidad que caracteriza al modelo." +
                "\n" +
                "\nLos faros principales actualizan su forma a una más convencional y aumentan en tamaño, aunque se siguen conservando las características luces diurnas LED con forma de L que precisamente este Lexus IS en 2013 introdujo en la gama Lexus como seña de identidad. La parrilla de doble punta de flecha sigue siendo una de las principales características del modelo, ahora más angulosa, que se acompaña ahora de unos paragolpes con unas entradas de aire más agresivas." +
                "\n" +
                "\nEn el interior también hay algunos cambios, aunque cuesta más apreciarlos. Significativa es la mejora de la pantalla multimedia, que pasa de 7 a 10,3″. Junto al joystick Remote Touch Interface de control del equipo multimedia se ha añadido un nuevo botón “Enter” que según la marca hace el sistema más fácil de utilizar. A nivel de diseño, la zona de la consola central en la que se ubica el climatizador y los controles de audio ha sido mejor integrada en el diseño. Los posavasos y el apoyabrazos de delante del RTI también se actualizan.");
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

