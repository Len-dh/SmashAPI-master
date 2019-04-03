package com.example.smashapi.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.smashapi.R;
import com.example.smashapi.model.Fighters;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.Console;

public class Activity_details extends Activity {
    //AFFICHAGE
    //variables pour toutes les donnees
    public TextView name;
    public TextView imageToUrl;
    public ImageView serie; //image
    public TextView firstApp;
    public TextView descCharac;
    public ImageView imToUrlCh;
    public TextView tiersRanking;
    public View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smash_row_item);


        //initial
        name = (TextView) findViewById(R.id.name);
        imToUrlCh = (ImageView) findViewById(R.id.imToUrlCh);


        //recupere le GSON passer en entree et le retransforme en objet console
        String jsonFighters = getIntent().getStringExtra("fighter_key");
        Gson gson = new Gson();
        Fighters item = gson.fromJson(jsonFighters, Fighters.class);

        //actualise la vue en fonction des parametres
        name.setText(item.getName());//affiche le nom de la console
        Picasso.get().load(item.getImToUrlCh()).into(imToUrlCh);

    }
}
