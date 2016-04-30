package alex.estudio.com.com.appnoticias;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DialogoInstrucciones extends DialogFragment {

    private MainActivity activity;

    public DialogoInstrucciones(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Instrucciones:" +
                "\n"+
                "\nEl botón gris sirve para poder acceder al menú, donde se encuentran las diferentes noticias." +
                "\n"+
                "\nEl botón rojo sirve para cerrar la Aplicación." +
                "\n"+
                "\nEn el menú podra elegir la noticia que mas le interese acerca diferentes modelos de coches.")
                .setTitle("INSTRUCCIONES DE APP NOTICIAS - ALEX")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int id) {
                        dialog.cancel();

                        activity.getInstrucciones().setClickable(true);
                    }
                });

        return builder.create();
    }
}