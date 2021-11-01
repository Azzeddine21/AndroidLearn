package azzeddine.lahmar.apprentissageandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private TextView myText;
    private Button myButton1;
    private Button myButton2;
    private Button myButton3;
    private Button myButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myText = findViewById(R.id.main2_textview_question);
        myButton1 = findViewById(R.id.main2_button_1);
        myButton2 = findViewById(R.id.main2_button_2);
        myButton3 = findViewById(R.id.main2_button_3);
        myButton4 = findViewById(R.id.main2_button_4);
        myButton1.setEnabled(false);
        myButton2.setEnabled(false);
        myButton3.setEnabled(false);
        myButton4.setEnabled(false);
    }
}