package com.example.learn_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button6);
        layout=findViewById(R.id.llo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.getOrientation()==LinearLayout.HORIZONTAL)
                    layout.setOrientation(LinearLayout.VERTICAL);
                else
                    layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

    }
}
