package com.esraa.hp.eventlisteners;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
Switch aSwitch;
TextView textView;
EditText editText;
String userName;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn);
        aSwitch=findViewById(R.id.aSwitch);
        editText=findViewById(R.id.edit);
        textView=findViewById(R.id.txt);
        linearLayout=findViewById(R.id.linear);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              userName=editText.getText().toString();
              textView.setText(userName);
            }
        });

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    //bs is isChecked variable
                    linearLayout.setBackgroundColor(Color.parseColor("#FFFC9f"));
                }
                else {
                    linearLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
