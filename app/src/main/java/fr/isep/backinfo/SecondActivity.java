package fr.isep.backinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void clicked(View v){
        Intent resultIntent = new Intent();
        EditText et = findViewById(R.id.infoIWantBack);

        resultIntent.putExtra("Key", et.getText().toString() );
        setResult(123456, resultIntent);
        finish();
    }
}