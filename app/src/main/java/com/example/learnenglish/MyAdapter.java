package com.example.learnenglish;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context context;
    List<Word> list;

    public MyAdapter(Context context, List<Word> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.words_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.russian.setText(list.get(position).getRussian());
        holder.english.setText(list.get(position).getEnglish());
        int i = position;

        holder.item_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(holder.itemView.getContext(),list.get(i).getMp());
                mediaPlayer.start();

            }
        });






    }



    @Override
    public int getItemCount() {

        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView russian, english;
        ImageButton item_button;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            russian = itemView.findViewById(R.id.russian);
            english = itemView.findViewById(R.id.english);
            item_button = itemView.findViewById(R.id.item_btn);

        }

    }
}

