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
    final static String TXT = "He vuelto";
    private Button boton;
    public ActivityPrincipalFragment() {


    }



    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view=inflater.inflate(R.layout.fragment_activity_principal, container, false);
        boton = (Button)view.findViewById(R.id.bplay);

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


                    Intent i= new Intent(getActivity(),ActivitySecond.class);
                    i.putExtra(ActivityPrincipalFragment.TXT,"HOLIS HOLIS");
                    startActivity(i);


                }
            }
        });



        return view;
    }
}
