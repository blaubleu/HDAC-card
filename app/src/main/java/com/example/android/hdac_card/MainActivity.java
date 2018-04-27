package com.example.android.hdac_card;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView websiteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        websiteView = findViewById(R.id.website_view);
        // open website URL:
        websiteView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
