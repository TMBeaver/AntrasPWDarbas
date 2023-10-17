package com.example.task2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.task2.WordCharacterCounter;


public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Spinner spinner;
    private Button countButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        countButton = findViewById(R.id.countButton);
        resultTextView = findViewById(R.id.resultTextView);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.count_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editText.getText().toString().trim();
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, R.string.empty_text_warning, Toast.LENGTH_SHORT).show();
                    return;
                }

                String selectedItem = spinner.getSelectedItem().toString();
                int count;
                if (selectedItem.equals(getString(R.string.words))) {
                    count = WordCharacterCounter.countWords(inputText);
                } else {
                    count = WordCharacterCounter.countCharacters(inputText);
                }

                resultTextView.setText(getString(R.string.result, count));
            }
        });
    }
}
