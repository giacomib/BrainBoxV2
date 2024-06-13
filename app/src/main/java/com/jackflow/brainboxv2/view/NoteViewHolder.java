package com.jackflow.brainboxv2.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.jackflow.brainboxv2.R;

public class NoteViewHolder extends RecyclerView.ViewHolder {

    private final TextView noteTitleItemView;
    private final TextView noteTextItemView;

    private NoteViewHolder(View itemView) {
        super(itemView);
        noteTitleItemView = itemView.findViewById(R.id.textViewTitle);
        noteTextItemView = itemView.findViewById(R.id.textViewText);
    }

    public void bind(String title, String text) {
        noteTitleItemView.setText(title);
        noteTextItemView.setText(text);
    }

    static NoteViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new NoteViewHolder(view);
    }
}
