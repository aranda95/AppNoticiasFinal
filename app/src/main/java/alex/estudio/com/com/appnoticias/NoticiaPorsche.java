package alex.estudio.com.com.appnoticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaPorsche extends AppCompatActivity implements View.OnClickListener {


    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoPorsche;
    private ImageView imagen;

    public int[] imagenes = {R.drawable.porsche1, R.drawable.porsche2, R.drawable.porsche3};
    private int posicion = 0, posicionFinal = imagenes.length - 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticiaporsche);


        atras = (ImageButton) findViewById(R.id.atrasAudi);
        adelante = (ImageButton) findViewById(R.id.imageButton4);
        menu = (ImageButton) findViewById(R.id.menu);
        textoPorsche = (TextView) findViewById(R.id.textoPorsche);
        imagen = (ImageView)findViewById(R.id.imagen);

        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);


        textoPorsche.setText("Porsche 718 Cayman 2016, el paso a los motores cuatro cilindros turbo" +
                "\n" +
                "\nEra cuestión de tiempo. Porsche ya había anunciado el cambio de las mecánicas atmosféricas de seis cilindros por las turboalimentadas de cuatro cilindros. El primer modelo en introducir esta medida fue el Porsche 718 Boxster y ahora le toca el turno al modelo de techo rígido, el Porsche 718 Cayman 2016. La estrategia en cuanto al nombre es la misma y se añade la denominación 718, que tiene un peso histórico para la marca." +
                "\n" +
                "\nComo bien decíamos el cambio principal del nuevo deportivo será su motor. Está situado en posición central y en el 718 Cayman normal se trata de un cuatro cilindros bóxer turbo de 2.0 litros que desarrolla una potencia de 300 CV y 380 Nm de par. También hemos conocido al 718 Cayman S, una versión más potente que utiliza otro cuatro cilindros turbo, esta vez de 2.5 litros, que alcanza los 350 CV y 420 Nm de par.\n" +
                "Los nuevos motores son más pequeños, más ligeros y reducen los consumos, pero a la vez mejoran las prestaciones. El 718 Cayman ‘normal’ con el paquete opcional Sport Chrono y el cambio automático PDK consigue hacer el 0-100 km/h en 4,7 segundos y una velocidad máxima de 275 km/h. Por su parte el 718 Cayman acelera de 0 a 100 km/h en 4,2 segundos y su velocidad punta es de 285 km/h, también con dicho cambio.\n" +
                "\n" +
                "\nPero su mecánica no es lo único que cambia, ya que su chasis recibe una serie de ajustes para mejorar. Estrena nuevos muelles más firmes y barras estabilizadoras que consiguen una mejor estabilidad. La dirección es un 10% más directa y las ruedas traseras algo más anchos, por lo que se incrementará el agarre lateral. La suspensión adaptativa PASM es 20 milímetros más baja y los frenos también se adaptan a la nueva potencia, el 718 Cayman S los hereda directamente del Porsche 911.");


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
