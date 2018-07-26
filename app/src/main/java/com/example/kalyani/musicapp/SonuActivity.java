package com.example.kalyani.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SonuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Create an array of words//
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Dulhe Raja","Akhiyon Se Goli Maare"));
        albums.add(new Album("Agnipath", "Abhi Mujh Mein Kahin"));
        albums.add(new Album("Dilwale", "Bole Chudiyan"));
        albums.add(new Album("Dil Hai Tumhara", "O Sahiba O Sahiba"));
        albums.add(new Album("Main Aisa Hi Hun", "Papa Mere Papa"));
        albums.add(new Album("Kal Ho Na Ho", "Kal Ho Na Ho"));
        albums.add(new Album("Veer-Zaara", "Do Pal"));
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
        }
}


