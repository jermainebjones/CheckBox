package com.jermainebjonesgmail.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox momCheckbox;
    private  CheckBox dadCheckbox;
    private CheckBox grandpaCheckbox;

    private Button showButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckbox = (CheckBox) findViewById(R.id.momCheckBoxID);
        dadCheckbox = (CheckBox) findViewById(R.id.dadID);
        grandpaCheckbox = (CheckBox) findViewById(R.id.grandpaID);

        showTextView = (TextView) findViewById(R.id.resultID);

        showButton = (Button) findViewById(R.id.showButtonID);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckbox.getText().toString() + " status is: " +
                        momCheckbox.isChecked() + "\n");
                stringBuilder.append(dadCheckbox.getText().toString() + " status is: "
                        + dadCheckbox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckbox.getText().toString() + " status is: "
                + grandpaCheckbox.isChecked() + "\n");

                showTextView.setText(stringBuilder);
            }
        });
    }
}
