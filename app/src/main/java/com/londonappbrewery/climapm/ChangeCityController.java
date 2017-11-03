package com.londonappbrewery.climapm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ChangeCityController extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.change_city_layout);
    final EditText editText = findViewById(R.id.queryET);
    ImageButton backbutton = findViewById(R.id.backButton);

    backbutton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        finish();
      }
    });
  }
}
