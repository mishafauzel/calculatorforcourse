package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.equation);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            editText.setShowSoftInputOnFocus(false);
        }else
        {
            editText.setTextIsSelectable(true);
        }

    }
    public void onClick(View view)
    {
        Editable text=editText.getText();
        switch (view.getId())
        {
            case R.id.number0:
            {text.insert(editText.getSelectionStart(),"0");
            break;}
            case R.id.number1:
            {text.insert(editText.getSelectionStart(),"1");
            break;}
            case R.id.plus:
            {
                text.insert(editText.getSelectionStart(),"+");
                break;
            }

        }
    }
}
