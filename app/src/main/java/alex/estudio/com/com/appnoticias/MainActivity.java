package alex.estudio.com.com.appnoticias;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Creación de los atributos de del Main
    private ImageButton botonGoToMenu;
    private ImageButton botonExitApp;
    private Button instrucciones;

    //Guetter de instrucciones para recogerlo en el Dialogo ( setClickable = true )
    public Button getInstrucciones() {
        return instrucciones;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonGoToMenu = (ImageButton)findViewById(R.id.botonMenu);
        botonExitApp = (ImageButton)findViewById(R.id.salir);
        instrucciones = (Button)findViewById(R.id.instrucciones);


        //Listeners de los botones declarados en Activity
        botonGoToMenu.setOnClickListener(this);
        botonExitApp.setOnClickListener(this);
        instrucciones.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        //El usuario se dirige al Menu de la App
        if (v.getId() == botonGoToMenu.getId()){

            Intent i = new Intent(this,Main2Activity.class);
            this.startActivity(i);
        }
        //El usuario sale de la aplicación, cerrando todos los recursos y procesos almacenados
         if (v.getId() == botonExitApp.getId()){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            System.exit(0);
        }
        //El usuario acude al dialogo creado de Instrucciones
        if (v.getId() == instrucciones.getId()){

            instrucciones.setClickable(false);
            FragmentManager fragmentManager = getFragmentManager();
            DialogoInstrucciones dialogo = new DialogoInstrucciones(this);
            dialogo.show(fragmentManager, "tagInstruccion");

        }


    }
}
