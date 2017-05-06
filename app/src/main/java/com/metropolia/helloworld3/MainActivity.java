package com.metropolia.helloworld3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    RelativeLayout.LayoutParams params;
    RelativeLayout.LayoutParams params2;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);

        params = (RelativeLayout.LayoutParams)textView.getLayoutParams();
        params2 = (RelativeLayout.LayoutParams)textView2.getLayoutParams();

        params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        params2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        textView.setLayoutParams(params);
        textView2.setLayoutParams(params2);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(i % 2)
                {
                    case 0:
                        textView2.setLayoutParams(params);
                        textView.setLayoutParams(params2);
                        break;
                    case 1:
                        textView.setLayoutParams(params);
                        textView2.setLayoutParams(params2);
                        break;
                    default:
                        break;
                }
                i++;
                System.out.println(i);
            }
        });
    }
}
