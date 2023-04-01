package com.example.contadordepildoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Declaro la variable que va a variar fuera de un metodo para que todos puedan acceder a ella
    public int contador;


    // Metodo onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Al ejecutarse este metodoonCreate la variable contador se hace 0.
        contador = 0;

    }


    // Metodo para mostrar el numero resultado
    public void mostrarResultado() {
        // Relaciono el objeto logico con su respectivo view a manipular
        TextView textResultado = (TextView) findViewById(R.id.tvCONTADOR);
        // Una vez relacionada, establesco el resultado con el metodo setText()(Clase TextView) castiando a string con valueOf90 ya que recibe un String setText()
        textResultado.setText(String.valueOf(contador));
    }


    // Metodo para incrementar uno
    public void incrementaContador(View vista) { // Recibe un objeto de tipo View que; es el view del boton al que referencie
        // Hago incrementar uno
        contador++;
        // Hago que se ejecute el metodo que muestra el resultado
        mostrarResultado();
    }


    // Metodo para decrementar uno
    public void restaContador(View vista) { // Recibe un objeto de tipo View que; es el view del boton al que referencie
//        // Hago decrementar en un uno
//        contador--;
        // Hago que se ejecute el metodo que muestra el resultado
        CheckBox micheckBox = findViewById(R.id.cbx1siN);
        if (micheckBox.isChecked() == true) {
            contador--;
        }else {
            if (micheckBox.isChecked()==false && contador>0) {
              contador--;
            }
              }
    mostrarResultado();
    }


    // Metodo para recetear a cero
    public void recetearContador(View view) {// Recibe un objeto de tipo View que; es el view del boton al que referencie
        // Hago que el contador sea igual a cero
        contador = 0;
        // Relaciono el objeto logico con su respectivo view a manipular
        EditText reseteador = (EditText) findViewById(R.id.etNUMEARESET);

        // a) Recuperacion de los valores introducidos por el ususario: Casting de EditText a String
        String string_NumAresetear = reseteador.getText().toString(); // declaro una variable de tipo string y le asgno el valor buscando el dato del componente
        // b) Casting de tipo string a int
        int int_NumAresetear = Integer.parseInt(string_NumAresetear); // Declaro variables de tipo int y le asigno valor parciando el string a int  con la clase Integrer y el metodo parseInt(), pasandole como argumento los string obtenido anteriormente
        contador = int_NumAresetear;

        mostrarResultado();

    }





}