package com.example.jp.projectfragmentspmdm;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class ActivityPrincipalFragment extends Fragment {


    Comunicador cm;

    public interface Comunicador{
        public void mensaje(String texto);
    }

    public void onAttach(Context contexto){
        super.onAttach(contexto);
        cm = (Comunicador)contexto;
    }

    //Creamos un variable string con un mensaje y un boton
    final static String TXT = "He vuelto";
    private Button boton;
    public ActivityPrincipalFragment() {


    }



    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creamos un objeto de tipo View para poder darle el metodo OnClick al boton

        View view=inflater.inflate(R.layout.fragment_activity_principal, container, false);
        boton = (Button)view.findViewById(R.id.bplay);

        //Dentro del onClick Creamos un if con un booleano para que si esta en landscape nos mande un toasta diciendo que esta en landcape y si esta en portrait lo mismo
        //
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(getResources().getBoolean(R.bool.modoDosPantallas)){
                    //Toast toast = Toast.makeText(getActivity(),"Estoy en Landscape", Toast.LENGTH_SHORT);
                    //toast.show();
                    cm.mensaje("Te tengo que decir adios");

                }else {

                   // Toast toast = Toast.makeText(getActivity(), "Estoy en Portrait", Toast.LENGTH_SHORT);
                   // toast.show();

                //Creamos un intent para comunicar el Fragment 1 con el 2
                    Intent i= new Intent(getActivity(),ActivitySecond.class);

                    i.putExtra(ActivityPrincipalFragment.TXT,"HOLIS HOLIS");
                    startActivity(i);


                }
            }
        });



        return view;
    }
}
