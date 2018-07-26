package com.example.kalyani.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kalyani.musicapp.R;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album>  {

    public AlbumAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songTextView.setText(currentAlbum.getsongName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView movieTextView = (TextView) listItemView.findViewById(R.id.Movie_name);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        movieTextView.setText(currentAlbum.getMovieName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}