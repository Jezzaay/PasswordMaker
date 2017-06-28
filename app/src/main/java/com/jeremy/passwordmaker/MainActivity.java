package com.jeremy.passwordmaker;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button newPassButton;
    TextView newPass;
   RngPass rngPass = new RngPass();
    ClipboardManager clipboardManager;
    ClipData dataClip;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clipboardManager = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        newPassButton = (Button) findViewById(R.id.button);
          newPass = (TextView) findViewById(R.id.NewPass);


        newPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = rngPass.newPass(newPass.toString());

                newPass.setText(text);
                newPass.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));


            }
        });

        newPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataClip = ClipData.newPlainText("text",text);
                clipboardManager.setPrimaryClip(dataClip);
                Toast.makeText(getApplicationContext(),"Password Copied:\n" + text,Toast.LENGTH_SHORT).show();
            }
        });





    }





    // Simple App for new passwords


}
