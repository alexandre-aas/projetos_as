package desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.formas.Circunferencia;
import desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.formas.Forma;
import desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.formas.Retangulo;
import desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces.formas.Triangulo;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3*/

//public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
public class MainActivity extends FragmentActivity implements AdapterView.OnItemSelectedListener{
    static final String TAG                     = "MainActivity";
    private static final String CIRCUNFERENCIA  = "Circunferência";
    private static final String RETANGULO       = "Retângulo";
    private static final String TRIANGULO       = "Triângulo";

    private Spinner spiOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiOpcoes   = findViewById(R.id.spiOpcoes);

        ArrayAdapter<String> adapterFormas = new ArrayAdapter<>(this
                , android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.formas_geometricas));
        adapterFormas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterFormas);
        spiOpcoes.setOnItemSelectedListener(this);




    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getItemAtPosition(i).toString().equals(CIRCUNFERENCIA)){


        } else if(adapterView.getItemAtPosition(i).toString().equals(RETANGULO)){


        } else if(adapterView.getItemAtPosition(i).toString().equals(TRIANGULO)){


        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /*
        Circunferencia c = new Circunferencia(1.5);
        System.out.println("areaCirc = " + c.area());

        Retangulo r = new Retangulo(2.5, 4.0);
        System.out.println("areaRet = " + r.area());

        Forma formas[] = new Forma[3];
        formas[0] = c;
        formas[1] = r;
        formas[2] = new Triangulo(1.0, 2.0, 2.0);
        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]);
            System.out.println("área = " + formas[i].area());
        }
    */
}