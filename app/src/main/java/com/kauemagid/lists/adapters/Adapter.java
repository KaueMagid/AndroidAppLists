package com.kauemagid.lists.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauemagid.lists.R;
import com.kauemagid.lists.model.Film;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Film> filmList;

    public Adapter(List<Film> list){
        this.filmList = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_list, parent, false);

        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Film film = filmList.get(position);
            holder.title.setText(film.getTitle());
            holder.kind.setText(film.getKind());
            holder.year.setText(film.getYear());
    }

    @Override
    public int getItemCount() {

        return filmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView year;
        private TextView kind;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView_title);
            year = itemView.findViewById(R.id.textView_year);
            kind = itemView.findViewById(R.id.textView_kind);
        }
    }
}
