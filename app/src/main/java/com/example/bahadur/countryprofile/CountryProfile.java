package com.example.bahadur.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfile extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);
       textView= (TextView) findViewById(R.id.text);
        imageView= (ImageView) findViewById(R.id.imgeId);

        Bundle bundle=getIntent().getExtras();
        String coutryName=bundle.getString("name");
        viewDetails(coutryName);
    }
    public void viewDetails(String countryName){

        if(countryName.equals("bangladesh"))
        {
            textView.setText(R.string.Bd_description);
            imageView.setImageResource(R.drawable.bangladesh_picture);

        }
        else if(countryName.equals("pakistan"))
        {
            textView.setText(R.string.Pk_description);
            imageView.setImageResource(R.drawable.pakistan_picture);

        }
        else if(countryName.equals("india"))
        {
            textView.setText(R.string.India_descriptio);
            imageView.setImageResource(R.drawable.india_piture);

        }




    }
}
