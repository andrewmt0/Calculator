package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText num1;
    private EditText num2;
    private Button tambah,kurang,kali,bagi;
    private float hasil;
    private int angka1,angka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        result = findViewById(R.id.Result);

        num1 = (EditText)findViewById(R.id.Num1);
        num2 = (EditText)findViewById(R.id.Num2);

        tambah = (Button)findViewById(R.id.Tambah);
        kurang = (Button)findViewById(R.id.Kurang);
        kali = (Button)findViewById(R.id.Kali);
        bagi = (Button)findViewById(R.id.Bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Integer.parseInt(num1.getText().toString());
                    angka2 = Integer.parseInt(num2.getText().toString());
                    hasil = angka1 + angka2;
                    result.setText(String.valueOf(hasil));
                } catch (Exception e) {
                    result.setText("Error");
                }
            }

        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Integer.parseInt(num1.getText().toString());
                    angka2 = Integer.parseInt(num2.getText().toString());
                    hasil = angka1 - angka2 ;
                    result.setText(String.valueOf(hasil));
                }catch (Exception e){
                    result.setText("Error");
                }

            }

        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Integer.parseInt(num1.getText().toString());
                    angka2 = Integer.parseInt(num2.getText().toString());
                    hasil = angka1 * angka2 ;
                    result.setText(String.valueOf(hasil));
                } catch (Exception e){
                    result.setText("Error");
                }

            }

        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    angka1 = Integer.parseInt(num1.getText().toString());
                    angka2 = Integer.parseInt(num2.getText().toString());
                    hasil = angka1 / angka2 ;
                    result.setText(String.valueOf(hasil));
                } catch (Exception e){
                    result.setText("Error");
                }

            }

        });





    }
}

