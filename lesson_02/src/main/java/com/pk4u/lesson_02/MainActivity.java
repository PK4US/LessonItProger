package com.pk4u.lesson_02;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnClick(View v) {
        EditText text_from_user = (EditText)findViewById(R.id.editText);
        TextView result = (TextView)findViewById(R.id.result_field);

        String text = text_from_user.getText().toString();
        if (!text.matches("")) {
            float num = Float.parseFloat(text);
            num *= 1.61;
            result.setText(Float.toString(num));
        }
    }
}