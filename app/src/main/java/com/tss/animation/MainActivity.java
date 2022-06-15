package com.tss.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button btBounce, btRotate, btSequential, btTogether;
    ImageView imageView;
    Animation bounceAnimation, rotateAnimation, togetherAnimation, sequentialAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        showAnimation();
    }

    // connection of view
    private void init() {
        btBounce = findViewById(R.id.bt_bounceAnimation);
        btRotate = findViewById(R.id.bt_rotateAnimation);
        btSequential = findViewById(R.id.bt_SequenceAnimation);
        btTogether = findViewById(R.id.bt_togetherAnimation);
        imageView = findViewById(R.id.imageView);
    }
    // manage all click and show output
    private void showAnimation() {

        btBounce.setOnClickListener(v -> bounceAnimation());
        btRotate.setOnClickListener(v -> rotateAnimation());
        btSequential.setOnClickListener(v -> sequentialAnimation());
        btTogether.setOnClickListener(v -> togetherAnimation());
    }
  // **********These methods set the animation on image view************* //

    private void rotateAnimation() {
        rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
        imageView.startAnimation(rotateAnimation);
    }

    private void bounceAnimation() {
       bounceAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_animation);
       imageView.startAnimation(bounceAnimation);
    }

    private void sequentialAnimation() {
        sequentialAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential_animation);
        imageView.startAnimation(sequentialAnimation);
    }

    private void togetherAnimation() {
        togetherAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.togather_animation);
        imageView.startAnimation(togetherAnimation);
    }

}