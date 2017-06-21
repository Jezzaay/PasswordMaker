package com.jeremy.passwordmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button newPassButton;
   RngPass rngPass = new RngPass();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newPassButton = (Button) findViewById(R.id.button);
          final TextView newPass = (TextView) findViewById(R.id.NewPass);

        newPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPass.setText(rngPass.newPass(newPass.toString()));
                newPass.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.slide_in_left));


            }
        });



    }




    // Simple App for new passwords


}
