package alex.estudio.com.com.appnoticias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class NoticiaBentley extends AppCompatActivity implements View.OnClickListener{
    private ImageButton atras;
    private ImageButton adelante;
    private ImageButton menu;
    private TextView textoBentley;
    private ImageView imagen;
    public int[] imagenesBentley = {R.drawable.bentley1, R.drawable.bentley2, R.drawable.bentley3};
    private int posicionIncial = 0, posicionFinal = imagenesBentley.length -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticiabentley);
        atras = (ImageButton)findViewById(R.id.atrasAudi);
        adelante = (ImageButton)findViewById(R.id.imageButton4);
        menu = (ImageButton)findViewById(R.id.menu);
        textoBentley = (TextView)findViewById(R.id.textoBentley);
        imagen = (ImageView)findViewById(R.id.imagen);
        atras.setOnClickListener(this);
        adelante.setOnClickListener(this);
        menu.setOnClickListener(this);
        textoBentley.setText("Bentley Mulsanne First Edition, 50 unidades para las tres versiones del modelo" +
                "\n" +
                "\nBentley ha presentado en el Salón de Pekín una nueva variante de su berlina más alta de gama. El Bentley Mulsanne First Edition es un claro ejemplo de lo que demandan los ciudadanos chinos más adinerados y exigentes. Esta edición especial estará limitada a 50 unidades y se ofrecerá en las tres variantes que ofrece la familia Mulsanne, como son el modelo de partida, el Mulsanne Speed y el Mulsanne Extended Wheelbase de batalla larga." +
                "\n" +
                "\nEn el exterior, el elemento clave para diferenciar al Bentley Mulsanne First Edition es una B alada específica. En el interior hay una serie de distintivos que dejan claro que estamos ante un First Edition, unas placas en los estribos de las puertas, la bandera británica con la inscripción First Edition en los respaldos de los asientos o en las mesitas de pic-nic son un ejemplo de ello." +
                "\n" +
                "\nLos ocupantes de las plazas traseras disfrutan de asientos de clase business con ajustes eléctricos climatizados y dos tablets Android de 10,2″ con una interface específica de Bentley y multitud de opciones de infoentretenimiento. Las cortinas de privacidad eléctricas y la neverita para el champan son dos ejemplos del nivel de lujo que puede llegar a ofrecer este Mulsanne. En una de las mesitas traseras, el Bentley Mulsanne First Edition tiene un pequeño kit de aseo fabricado en plata por la famosa joyería Asprey de Londres. Este incluye un pequeño espejo, cepillo de pelo y peine, para llegar con el pelo perfecto a cualquier reunión o acto de sociedad.");
    }
    public void metodoatras(){
        if (posicionIncial <= 0) {
            posicionIncial = posicionFinal;
        } else {
            posicionIncial = posicionIncial - 1;
        }
        imagen.setImageResource(imagenesBentley[posicionIncial]);
    }
    public void metodoadelante(){
        if (posicionIncial >= posicionFinal) {
            posicionIncial = 0;
        } else {
            posicionIncial = posicionIncial + 1;
        }
        imagen.setImageResource(imagenesBentley[posicionIncial]);
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
