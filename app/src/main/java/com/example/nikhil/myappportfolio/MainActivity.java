package com.example.nikhil.myappportfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonpop,buttonstock,buttonbuild,buttonmake,buttongo,buttoncap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonpop = (Button) findViewById(R.id.buttonp);

        buttonstock = (Button) findViewById(R.id.buttons);

        buttonbuild = (Button) findViewById(R.id.buttonb);

        buttonmake = (Button) findViewById(R.id.buttonm);

        buttongo = (Button) findViewById(R.id.buttong);

        buttoncap = (Button) findViewById(R.id.buttonc);

    }
    public void todo(View v){

        if(v.equals(buttonstock))
            Toast.makeText(getApplicationContext(),"Click this for stock hawk application",Toast.LENGTH_SHORT).show();
        if(v.equals(buttonbuild))
            Toast.makeText(getApplicationContext(),"Click this for build it bigger application",Toast.LENGTH_SHORT).show();
        if(v.equals(buttonmake))
            Toast.makeText(getApplicationContext(),"Click this for make your app material application",Toast.LENGTH_SHORT).show();
        if(v.equals(buttongo))
            Toast.makeText(getApplicationContext(),"Click this for go ubiqutious application",Toast.LENGTH_SHORT).show();
        if(v.equals(buttoncap))
            Toast.makeText(getApplicationContext(),"Click this for capstone application",Toast.LENGTH_SHORT).show();
    }
    public void gitPop(View v){
        Toast.makeText(getApplicationContext(),"Redirecting to git Repo",Toast.LENGTH_LONG).show();
        Uri uri = Uri.parse("https://github.com/nikhil-31/Popularmovies1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void website(View v){
        Uri uri = Uri.parse("http://nkl07ba.github.io/portfolio/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void gitHub(View v){
        Uri uri = Uri.parse("https://github.com/nikhil-31");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
