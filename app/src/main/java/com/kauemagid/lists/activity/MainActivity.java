package com.kauemagid.lists.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.kauemagid.lists.R;
import com.kauemagid.lists.RecyclerItemClickListener;
import com.kauemagid.lists.adapters.Adapter;
import com.kauemagid.lists.model.Film;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Film> filmsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Films list
        this.createFilms();
        //Adapter Config
        Adapter adapter = new Adapter( filmsList );

        //Recycle Config
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this , LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Click event
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Film film = filmsList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Item Pressionado: " + film.getTitle(),
                                        Toast.LENGTH_LONG
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Film film = filmsList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Click longo: " + film.getTitle(),
                                        Toast.LENGTH_LONG
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                })
        );

    }

    private void createFilms(){

        Film film = new Film("Mulher Maravilha","Fantasia", "2017");
        this.filmsList.add(film);
        film = new Film("Homem Aranha", "Ação", "2015");
        this.filmsList.add(film);
        film = new Film("Vingadores", "Ação", "2012");
        this.filmsList.add(film);
        film = new Film("2012", "tragédia", "2012");
        this.filmsList.add(film);
        film = new Film("Queen", "Documentario musical", "2018");
        this.filmsList.add(film);
        film = new Film("Homem de Ferro", "Ação", "2010");
        this.filmsList.add(film);
        film = new Film("thor", "Ação", "2015");
        this.filmsList.add(film);
        film = new Film("Homem Formiga", "Ação", "2015");
        this.filmsList.add(film);
        film = new Film("Vespa", "Ação", "2015");
        this.filmsList.add(film);
        film = new Film("A Era de Ultron", "Ação", "2015");
        this.filmsList.add(film);

    }

}
