package com.example.bahadur.countryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  private Button bangladesBtn,pakistanBtn,indiaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladesBtn= (Button) findViewById(R.id.bdid);
        pakistanBtn= (Button) findViewById(R.id.pkid);
        indiaBtn= (Button) findViewById(R.id.inid);

        bangladesBtn.setOnClickListener(this);
        indiaBtn.setOnClickListener(this);
        pakistanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bdid)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        else if(v.getId()==R.id.pkid)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }

        else if(v.getId()==R.id.inid)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }

    }
    @Override
    public void onBackPressed(){

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setIcon(R.drawable.question_icon);
        alertDialogBuilder.setTitle(R.string.Title);
        alertDialogBuilder.setMessage(R.string.message);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();

            }
        });
       // AlertDialog alertDialog=alertDialogBuilder.create();

        alertDialogBuilder.show();
    }

}
