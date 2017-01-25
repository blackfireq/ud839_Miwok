package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mikem on 1/24/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get the current set of words
        Word currentWord = getItem(position);

        // get the textview  that will have the default text
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // set the text in the default text texview
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // get the textview that will have the miwok text
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        // set the tex in the miwok text textview
        miwokTextView.setText(currentWord.getMiwokTranslation());


        return listItemView;
    }






}
