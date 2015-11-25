package com.tomatoset.app.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tomatoset.app.adapters.MenuFood;
import com.tomatoset.app.adapters.RVAdapter;

import java.util.ArrayList;
import java.util.List;

import tomatoset.com.global.R;

public class MenuFragment extends Fragment {

    private List<MenuFood> menuFoods;

    public static MenuFragment getInstance(){
        Bundle args = new Bundle();
        MenuFragment fragment = new MenuFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu, container, false);
        RecyclerView rv = (RecyclerView) v.findViewById(R.id.rv);
        rv.setHasFixedSize(true); //неизменяемый размер
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);
        initializeData();
        RVAdapter adapter = new RVAdapter(menuFoods);
        rv.setAdapter(adapter);
        return v;
    }

    private void initializeData(){
        menuFoods = new ArrayList<>();
        menuFoods.add(new MenuFood("Burger", "150 рублей", R.drawable.burger));
        menuFoods.add(new MenuFood("Cheeseburger", "200 рублей", R.drawable.cheeseburger));
        menuFoods.add(new MenuFood("Fish", "600 рублей", R.drawable.fish));
        menuFoods.add(new MenuFood("Poncho", "100 рублей", R.drawable.poncho));

    }
}
