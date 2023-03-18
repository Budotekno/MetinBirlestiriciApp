 package com.example.metinbirlestir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtMetin1, txtMetin2;
    TextView lblMetin;
    Button btnBirlestir, btnTemizle;

    String yazi1, yazi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMetin1 = findViewById(R.id.txtMetin1);
        txtMetin2 = findViewById(R.id.txtMetin2);
        lblMetin = findViewById(R.id.lblMetin);
        btnBirlestir = findViewById(R.id.btnBirlestir);
        btnTemizle=findViewById(R.id.btnTemizle);

        btnBirlestir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                yazi1= txtMetin1.getText().toString();
                yazi2= txtMetin2.getText().toString();

                lblMetin.setText(yazi1+" "+yazi2);

                

            }
        });

        btnTemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMetin1.setText("");
                txtMetin2.setText("");
                lblMetin.setText("");
            }
        });

    }
}