package com.omar.object;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.omar.objectscale.objectscale;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView object = findViewById(R.id.imageView);

      final  RelativeLayout rootlayout = findViewById(R.id.root);
        object.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {



                objectscale o=new objectscale();
                o.touchgrappingMechanism(motionEvent,view,rootlayout,MainActivity.this);


                return true;
            }
        });


    }

}
