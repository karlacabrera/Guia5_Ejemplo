package org.dev4u.hv.guia5_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {
    private Button btnAnim1,btnAnim2,btnAnim3;
    private Animation anim_abajo1,anim_abajo2,anim_abajo3;
    private ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        btnAnim1 = (Button) findViewById(R.id.bntIzq);
        btnAnim2 = (Button) findViewById(R.id.btnCentro);
        btnAnim3 = (Button) findViewById(R.id.btnDer);

        img1 = (ImageView) findViewById(R.id.ImgCorona1);
        img2 = (ImageView) findViewById(R.id.ImgCorona2);
        img3 = (ImageView) findViewById(R.id.ImgCorona3);

        anim_abajo1 = AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);
        anim_abajo1.setDuration(1500);
        anim_abajo1.setFillAfter(true);

        anim_abajo2 = AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);
        anim_abajo2.setDuration(1500);
        anim_abajo2.setFillAfter(true);

        anim_abajo3 = AnimationUtils.loadAnimation(this,R.anim.bajar_aparecer);
        anim_abajo3.setDuration(1500);
        anim_abajo3.setFillAfter(true);

        btnAnim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.startAnimation(anim_abajo1);
            }
        });
        btnAnim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.startAnimation(anim_abajo2);
            }
        });
        btnAnim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3.startAnimation(anim_abajo3);
            }
        });
    }
}
