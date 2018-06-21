package zpum.lab1.laboratorium1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText liczba1;
    EditText liczba2;
    TextView wynik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        liczba1 = findViewById(R.id.liczba1EditText);
        liczba2 = findViewById(R.id.liczba2EditText);
        wynik = findViewById(R.id.wynikTextView);

    }

    public void dodawanieOnClick(View view) {
        int dodawanie = Integer.parseInt(liczba1.getText().toString()) + Integer.parseInt(liczba2.getText().toString());
        String s = String.valueOf(dodawanie);
        wynik.setText(s);
    }
    public void odejmowanieOnClick(View view) {
        int odejmowanie =Integer.parseInt(liczba1.getText().toString()) - Integer.parseInt(liczba2.getText().toString());
        String s = String.valueOf(odejmowanie);
        wynik.setText(s);
    }
    public void mnozenieOnClick(View view) {
        int mnozenie =Integer.parseInt(liczba1.getText().toString()) * Integer.parseInt(liczba2.getText().toString());
        String s = String.valueOf(mnozenie);
        wynik.setText(s);

    }
    public void dzielenieOnClick(View view) {
        int dzielenie =Integer.parseInt(liczba1.getText().toString()) / Integer.parseInt(liczba2.getText().toString());
        String s = String.valueOf(dzielenie);
        wynik.setText(s);

    }
    public void moduloOnClick(View view) {
        int modulo =Integer.parseInt(liczba1.getText().toString()) % Integer.parseInt(liczba2.getText().toString());
        String s = String.valueOf(modulo);
        wynik.setText(s);

    }
}
