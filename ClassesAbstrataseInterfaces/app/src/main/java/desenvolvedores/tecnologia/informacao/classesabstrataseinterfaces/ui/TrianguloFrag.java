package desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.R;

public class TrianguloFrag extends Fragment {

    public TrianguloFrag() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutFragment = inflater.inflate(R.layout.fragment_triangulo, container, false);


        return layoutFragment;
    }
}