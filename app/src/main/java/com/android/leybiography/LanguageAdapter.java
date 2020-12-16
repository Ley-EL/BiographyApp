package com.android.leybiography;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {

    private ArrayList<LanguageItem> mLanguageItem = new ArrayList<>();

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.language_cardview_item,
                parent, false);
        LanguageViewHolder lvh = new LanguageViewHolder(v);
        return lvh;
    }


    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {
        LanguageItem currentItem = mLanguageItem.get(position);

        holder.mLogoLanguage.setImageResource(currentItem.getmImageResource());
        holder.mLanguageName.setText(currentItem.getmLanguageName());
        holder.mLanguageDescription.setText(currentItem.getmLanguageDescription());
        holder.cardView.setBackgroundResource(currentItem.getmBackgroundResource());
    }

    @Override
    public int getItemCount() {
        return mLanguageItem.size();
    }

    public static class LanguageViewHolder extends RecyclerView.ViewHolder {

        private ImageView mLogoLanguage;
        private TextView mLanguageName, mLanguageDescription;
        private CardView cardView;

        public LanguageViewHolder(@NonNull View itemView) {
            super(itemView);

            mLogoLanguage = itemView.findViewById(R.id.logo_language);
            mLanguageName = itemView.findViewById(R.id.language_name);
            mLanguageDescription = itemView.findViewById(R.id.language_description);
            cardView = itemView.findViewById(R.id.language_cardview_item);
        }
    }

    public LanguageAdapter(ArrayList<LanguageItem> mLanguageItem) {
        this.mLanguageItem = mLanguageItem;
    }
}
