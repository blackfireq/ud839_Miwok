package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by mikem on 1/24/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

        private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
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


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.miwokImage);

        if(currentWord.HasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }

        // set background color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }






}
