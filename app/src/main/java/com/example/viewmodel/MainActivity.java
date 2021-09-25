package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();
    TextView mTextView;
    String preservedDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.tvNumber);
        DataGenerator model = new DataGenerator();
        String myRandomNumber = model.getNumber();
        mTextView.setText(myRandomNumber);

        Log.i(TAG, "Random Number Set");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);

        preservedDisplay = mTextView.getText().toString();
        outState.putString("preserved_display", preservedDisplay);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        mTextView.setText(savedInstanceState.getString("preserved_display"));
    }
}