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

                Intent intent = new Intent(getActivity(),ActivitySecond.class);

                startActivity(intent);

                Toast.makeText(getActivity(), "Esto es la segunda Activity", Toast.LENGTH_SHORT).show();

            }
        });



        return view;
    }
}
