package com.example.jp.projectfragmentspmdm;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class ActivitySecondFragment extends Fragment {
    TextView txt;
    public ActivitySecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View f2 = inflater.inflate(R.layout.fragment_activity_second, container,false);
        txt = (TextView) f2.findViewById(R.id.text);
        return f2;
    }

    public void cambiarTexto(String text){
        txt.setText(text);
    }

}
