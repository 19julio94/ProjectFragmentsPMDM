package com.example.jp.projectfragmentspmdm;

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

    public ActivityPrincipalFragment() {
    }
    private Button boton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_activity_principal, container, false);
        boton = (Button)view.findViewById(R.id.bplay);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(getResources().getBoolean(R.bool.modoDosPantallas)){
                    Toast toast = Toast.makeText(getActivity(),"Estoy en Landscape", Toast.LENGTH_SHORT);
                    toast.show();


                }else {

                    Toast toast = Toast.makeText(getActivity(), "Estoy en Portrait", Toast.LENGTH_SHORT);
                    toast.show();


                    //Intent intent = new Intent(getActivity(), ActivitySecond.class);

                    //startActivity(intent);


                }
            }
        });



        return view;
    }
}
