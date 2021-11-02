package azzeddine.lahmar.apprentissageandroid.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import azzeddine.lahmar.apprentissageandroid.R;
import azzeddine.lahmar.apprentissageandroid.model.User;

public class MainActivity extends AppCompatActivity {

    private TextView mySentance;
    private EditText myForm;
    private Button myButton;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySentance = findViewById(R.id.main_textview_myText);
        myForm = findViewById(R.id.main_edittext_myEdit);
        myButton = findViewById(R.id.main_button_myButton);


        myForm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                myButton.setEnabled(false);

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                myButton.setEnabled(!s.toString().isEmpty());

            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeActivity = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(changeActivity);
                user.setFirstName(myForm.getText().toString());

            }
        });

    }
}