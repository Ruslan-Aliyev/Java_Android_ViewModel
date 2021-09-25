package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = findViewById(R.id.tvNumber);
        //DataGenerator model = new DataGenerator();
        DataGenerator model = ViewModelProviders.of(this).get(DataGenerator.class);
        String myRandomNumber = model.getNumber();
        mTextView.setText(myRandomNumber);

        Log.i(TAG, "Random Number Set");
    }
}