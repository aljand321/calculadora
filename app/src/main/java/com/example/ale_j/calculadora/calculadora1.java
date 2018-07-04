package com.example.ale_j.calculadora;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class calculadora1 extends Fragment {
    private TextView screem;
    private String dispaly = "";
    private String currentOperator = "";
    private String result = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        screem = (TextView)screem.findViewById( R.id.ViewDatos );
        screem.setText( dispaly );

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view= inflater.inflate(R.layout.fragment_calculadora1, container, false);

        return view;


    }


    private void updateScreem(){
        screem.setText( dispaly );
    }

    public void OnclickNumber (View v){
        Button b = (Button) v;
        dispaly += b.getText();
        updateScreem();
    }
    public void  onclickOperator (View v){
        Button b = (Button) v;
        dispaly += b.getText();
        currentOperator = b.getText().toString();
        updateScreem();
    }

    private void  clear (){
        dispaly = "";
        currentOperator = "";

    }

    public void  onCLickClear (View v){
        clear();
        updateScreem();
    }

    public void  onclickEqual(View v){

    }
}
