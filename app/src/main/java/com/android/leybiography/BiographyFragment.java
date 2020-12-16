package com.android.leybiography;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BiographyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_biography, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView text = view.findViewById(R.id.biography_text);

//        try {
//
//            FileWriter fw = new FileWriter("C:\\Users\\PC\\AndroidStudioProjects\\LeyBiography\\app\\src\\main\\java\\com\\android\\leybiography\\biography.txt");
//            fw.write("Hey salut a tous, je realise mon premier projet android");
//            fw.close();
//            Toast.makeText(getActivity(), "Done", Toast.LENGTH_SHORT).show();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            FileOutputStream fOut = getActivity().openFileOutput("biography.txt", Context.MODE_APPEND);
//
//            String str = "data";
//            fOut.write(str.getBytes());
//            fOut.close();
//            Log.d("FileResponse", "Write with succes");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
}
