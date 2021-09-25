package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;

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
        DataGenerator model = new DataGenerator();
        String myRandomNumber = model.getNumber();
        mTextView.setText(myRandomNumber);

        Log.i(TAG, "Random Number Set");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            Toast.makeText(getApplicationContext(), "Portrait Mode", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Landscape Mode", Toast.LENGTH_SHORT).show();
        }
    }
}