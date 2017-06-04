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
 * Created by soubhik.sm on 01-06-2017.
 */

public class WordAdapter extends ArrayAdapter<Word>  {

    private int myColor;

    public WordAdapter(Activity context, ArrayList<Word> mywords, int colorID){
        super(context,0,mywords);
        myColor=colorID;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord=getItem(position);

        ImageView myImg = (ImageView) listItemView.findViewById(R.id.myimage);
        if(currentWord.hasImage()) {
            myImg.setImageResource(currentWord.getImageResourceID());
            myImg.setVisibility(View.VISIBLE);
        }
        else{
            myImg.setVisibility(View.GONE);
        }

        TextView miwoktext=(TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwoktext.setText(currentWord.getMiwokTranslation());

        TextView defaultText=(TextView) listItemView.findViewById(R.id.default_text_view);
        defaultText.setText(currentWord.getDefaultTranslation());

        LinearLayout mylayout=(LinearLayout) listItemView.findViewById(R.id.text_conatiner);
        int color= ContextCompat.getColor(getContext(), myColor);
        mylayout.setBackgroundColor(color);

        return listItemView;
    }
}
