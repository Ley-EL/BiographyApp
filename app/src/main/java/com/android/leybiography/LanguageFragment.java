package com.android.leybiography;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private LanguageAdapter mLanguageAdapter;
    private ArrayList<LanguageItem> mLanguageItem;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        createLanguageItem();
        buildRecyclerView(view);

    }

    private void createLanguageItem() {
        mLanguageItem = new ArrayList<>();
        mLanguageItem.add(new LanguageItem(R.drawable.html_logo, R.drawable.profile_color_gradient,
                "HTML", R.string.html_description));

        mLanguageItem.add(new LanguageItem(R.drawable.css_logo,R.drawable.profile_color_gradient,
                "CSS", R.string.css_description));

        mLanguageItem.add(new LanguageItem(R.drawable.php_logo, R.drawable.profile_color_gradient,
                "PHP", R.string.php_description));

        mLanguageItem.add(new LanguageItem(R.drawable.sql_logo, R.drawable.profile_color_gradient,
                "SQL", R.string.sql_description));

        mLanguageItem.add(new LanguageItem(R.drawable.js_logo, R.drawable.profile_color_gradient,
                "JavaScript", R.string.js_description));

        mLanguageItem.add(new LanguageItem(R.drawable.python_logo, R.drawable.profile_color_gradient,
                "Python", R.string.python_description));

        mLanguageItem.add(new LanguageItem(R.drawable.java_logo, R.drawable.profile_color_gradient,
                "Java", R.string.java_description));

        mLanguageItem.add(new LanguageItem(R.drawable.cpp_logo, R.drawable.profile_color_gradient,
                "C++", R.string.cpp_description));

        mLanguageItem.add(new LanguageItem(R.drawable.c_sharp_logo, R.drawable.profile_color_gradient,
                "C#",R.string.c_sharp_description));

        mLanguageItem.add(new LanguageItem(R.drawable.c_logo, R.drawable.profile_color_gradient,
                "C", R.string.c_description));
    }

    private void buildRecyclerView(View v) {
        // get recycler view id
        mRecyclerView = v.findViewById(R.id.recycler_view);

        // define my recycler view
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager recyclerLayoutManager = new LinearLayoutManager(getActivity());
        mLanguageAdapter = new LanguageAdapter(mLanguageItem);

        // define the layout type
        mRecyclerView.setLayoutManager(recyclerLayoutManager);

        // attach my recycler view to my adapter
        mRecyclerView.setAdapter(mLanguageAdapter);
    }

}
