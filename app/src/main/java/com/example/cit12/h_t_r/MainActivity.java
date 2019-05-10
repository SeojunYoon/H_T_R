package com.example.cit12.h_t_r;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();
        final int month = date.getMonth() + 1;

        ImageButton monthbt = (ImageButton)findViewById(R.id.thismonth);

        monthbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch(month){
                    case 1:
                        intent = new Intent(
                                getApplicationContext(),
                                Januray.class);
                        break;

                    case 2:
                        intent = new Intent(
                                getApplicationContext(),
                                Feburary.class);
                        break;

                    case 3:
                        intent = new Intent(
                                getApplicationContext(),
                                March.class);
                        break;

                    case 4:
                        intent = new Intent(
                                getApplicationContext(),
                                April.class);
                        break;

                    case 5:
                        intent = new Intent(
                                getApplicationContext(),
                                May.class);
                        break;

                    case 6:
                        intent = new Intent(
                                getApplicationContext(),
                                June.class);
                        break;

                    case 7:
                        intent = new Intent(
                                getApplicationContext(),
                                July.class);
                        break;

                    case 8:
                        intent = new Intent(
                                getApplicationContext(),
                                August.class);
                        break;

                    case 9:
                        intent = new Intent(
                                getApplicationContext(),
                                September.class);
                        break;

                    case 10:
                        intent = new Intent(
                                getApplicationContext(),
                                October.class);
                        break;

                    case 11:
                        intent = new Intent(
                                getApplicationContext(),
                                November.class);
                        break;

                    case 12:
                        intent = new Intent(
                                getApplicationContext(),
                                December.class);
                        break;

                    default:
                        intent = new Intent(
                                getApplicationContext(),
                                MainActivity.class);
                }
                startActivity(intent);
            }
        });

        switch(month){
            case 1:
                monthbt.setImageResource(R.drawable.januaryimage);
                break;
            case 2:
                monthbt.setImageResource(R.drawable.feburaryimage);
                break;
            case 3:
                monthbt.setImageResource(R.drawable.marchimage);
                break;
            case 4:
                monthbt.setImageResource(R.drawable.aprilimage);
                break;
            case 5:
                monthbt.setImageResource(R.drawable.mayimage);
                break;
            case 6:
                monthbt.setImageResource(R.drawable.juneimage);
                break;
            case 7:
                monthbt.setImageResource(R.drawable.genji);
                break;
            case 8:
                monthbt.setImageResource(R.drawable.genji);
                break;
            case 9:
                monthbt.setImageResource(R.drawable.genji);
                break;
            case 10:
                monthbt.setImageResource(R.drawable.genji);
                break;
            case 11:
                monthbt.setImageResource(R.drawable.genji);
                break;
            case 12:
                monthbt.setImageResource(R.drawable.genji);
                break;
            default:
                monthbt.setImageResource(R.drawable.genji);
        }

        final ImageButton dictionarybt=(ImageButton)findViewById(R.id.dictionary);
        dictionarybt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(
                        getApplicationContext(),
                        dictionary.class
                );
                startActivity(intent);
            }
        });

        final ImageButton aboutme=(ImageButton)findViewById(R.id.aboutme);
        aboutme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent;
                intent = new Intent(
                        getApplicationContext(),
                        AboutMe.class
                );
                startActivity(intent);
            }
        });


    }
}
