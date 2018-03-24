package com.maxron.daggersample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.maxron.daggersample.R;
import com.maxron.daggersample.model.Car;
import com.maxron.daggersample.model.Man;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Man man;

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
        Car car = new Car();
        man = new Man();
        man.setCar(car);
        textView.setText(man.carBrand());
    }
}
