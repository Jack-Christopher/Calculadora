package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonPunto, buttonC, buttonEqual;
    EditText entradaTexto;

    float valor1, valor2;

    boolean Suma, Resta, Multiplicacion, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.buttonNum0);
        button1 = (Button) findViewById(R.id.buttonNum1);
        button2 = (Button) findViewById(R.id.buttonNum2);
        button3 = (Button) findViewById(R.id.buttonNum3);
        button4 = (Button) findViewById(R.id.buttonNum4);
        button5 = (Button) findViewById(R.id.buttonNum5);
        button6 = (Button) findViewById(R.id.buttonNum6);
        button7 = (Button) findViewById(R.id.buttonNum7);
        button8 = (Button) findViewById(R.id.buttonNum8);
        button9 = (Button) findViewById(R.id.buttonNum9);
        buttonPunto = (Button) findViewById(R.id.buttonPunto);
        buttonAdd = (Button) findViewById(R.id.buttonSumar);
        buttonSub = (Button) findViewById(R.id.buttonRestar);
        buttonMul = (Button) findViewById(R.id.buttonMultiplicar);
        buttonDivision = (Button) findViewById(R.id.buttonDividir);
        buttonC = (Button) findViewById(R.id.buttonClear);
        buttonEqual = (Button) findViewById(R.id.buttonIgual);
        entradaTexto = (EditText) findViewById(R.id.editTextEntrada);


        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "0";
                entradaTexto.setText(Cadena);
            }
        });

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "1";
                entradaTexto.setText(Cadena);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "2";
                entradaTexto.setText(Cadena);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "3";
                entradaTexto.setText(Cadena);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "4";
                entradaTexto.setText(Cadena);
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "5";
                entradaTexto.setText(Cadena);
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "6";
                entradaTexto.setText(Cadena);
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "7";
                entradaTexto.setText(Cadena);
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "8";
                entradaTexto.setText(Cadena);
            }
        });

        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + "9";
                entradaTexto.setText(Cadena);
            }
        });

        buttonPunto.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Cadena = entradaTexto.getText() + ".";
                entradaTexto.setText(Cadena);
            }
        });




        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                valor1 = Float.parseFloat(entradaTexto.getText() + "");
                Suma = true;
                entradaTexto.setText(null);
            }
        });


        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                valor1 = Float.parseFloat(entradaTexto.getText() + "");
                Resta = true;
                entradaTexto.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                valor1 = Float.parseFloat(entradaTexto.getText() + "");
                Multiplicacion = true;
                entradaTexto.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                valor1 = Float.parseFloat(entradaTexto.getText() + "");
                Division = true;
                entradaTexto.setText(null);
            }
        });





        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entradaTexto.setText("");
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor2 = Float.parseFloat(entradaTexto.getText() + "");

                if (Suma)
                {
                    entradaTexto.setText(valor1 + valor2+ "");
                    Suma = false;
                }

                else if (Resta)
                {
                    entradaTexto.setText(valor1 - valor2 + "");
                    Resta = false;
                }

                else if (Multiplicacion)
                {
                    entradaTexto.setText(valor1 * valor2 + "");
                    Multiplicacion = false;
                }

                else if (Division)
                {
                    entradaTexto.setText(valor1 / valor2 + "");
                    Division = false;
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Debe ingresar un segundo valor", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });









    }

}