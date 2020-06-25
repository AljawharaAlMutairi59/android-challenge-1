package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Boolean xturn = true;
TextView x ;
int[] Xarray = new int[9];
int [] Oarray = new int [9] ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button one = findViewById(R.id.button1);
        final Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button four = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
        final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight = findViewById(R.id.button8);
        final Button nine = findViewById(R.id.button9);
        final Button resstart = findViewById(R.id.button10);
        x = findViewById(R.id.textView)

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [0]=1;
                    checkXwin();
                    one.setText("X");
                else
                    Oarray[0]=1;
                    checkOwin();
                    one.setText("O");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [1]=1 ;
                    checkXwin();
                    two.setText("X");
                else
                    Oarray[1]=1;
                    checkOwin();
                    two.setText("O");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [2]=1;
                  checkXwin();
                  three.setText("X");
                else
                    Oarray[2]=1;
                    checkOwin();
                    three.setText("O");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                if (xturn) {
                    Xarray [3]=1;
                    checkXwin();
                    four.setText("X");
                else
                    Oarray[3]=1;
                    checkOwin();
                    four.setText("O");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [4]=1;
                    checkXwin();
                    one.setText("X");
                else
                    Oarray[4]=1;
                    checkOwin();
                    one.setText("O");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [5]=1;
                    checkXwin();
                    six.setText("X");
                else
                    Oarray[5]=1;
                    checkOwin();
                    six.setText("O");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [6]=1;
                    checkXwin();
                    seven.setText("X");
                else
                    Oarray[6]=1;
                    checkOwin();
                    seven.setText("O");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [7]=1;
                    checkXwin();
                    eight.setText("X");
                else
                    Oarray[7]=1;
                    checkOwin();
                    eight.setText("O");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (xturn) {
                    Xarray [8]=1;
                    checkXwin();
                    nine.setText("X");
                else
                    Oarray[8]=1;
                    checkOwin();
                    nine.setText("O");
                }
            }
        });
        resstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");
                nine.setText("");


            }
        });



    }
    public void checkXwin () {
        xturn = false;
        x.setText("O Turn");

        if (Xarray[0] == 1 && Xarray[1] == 1 && Xarray[2] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[0] == 1 && Xarray[3] == 1 && Xarray[7] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[6] == 1 && Xarray[7] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[2] == 1 && Xarray[5] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[0] == 1 && Xarray[4] == 1 && Xarray[8] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[2] == 1 && Xarray[4] == 1 && Xarray[6] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[1] == 1 && Xarray[4] == 1 && Xarray[7] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
        if (Xarray[3] == 1 && Xarray[4] == 1 && Xarray[5] == 1) {
            Toast.makeText(MainActivity.this, "X WON! "Toast.LENGTH_SHORT).show();
        }
    }
    public void checkOwin () {
        xturn = true;
        x.setText("X Turn");

            if (Oarray[0]==1 && Oarray[1]==1 && Oarray[2]==1)
            {
                Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
            }

        if (Oarray[0]==1 && Oarray[3]==1 && Oarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }

        if (Oarray[2]==1 && Oarray[5]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }

        if (Oarray[6]==1 && Oarray[7]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }
        if (Oarray[0]==1 && Oarray[4]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }
        if (Oarray[2]==1 && Oarray[4]==1 && Oarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }
        if (Oarray[1]==1 && Oarray[4]==1 && Oarray[7]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }
        if (Oarray[3]==1 && Oarray[4]==1 && Oarray[5]==1)
        {
            Toast.makeText(MainActivity.this,"O WON! "Toast.LENGTH_SHORT).show();
        }


    }
}