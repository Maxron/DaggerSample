package com.maxron.daggersample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.maxron.daggersample.R;
import com.maxron.daggersample.model.Man;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Inject
    Man man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        init();
    }

    private void findViews() {
        textView = findViewById(R.id.textview);
    }

    private void init() {
        /**
         * Because the DaggerMainActivityComponent.java is generated by compiler.
         * Therefor, you should run "build" before write down this line.
         */
        DaggerMainActivityComponent.create().inject(this);
        textView.setText(man.carBrand());
    }
}
