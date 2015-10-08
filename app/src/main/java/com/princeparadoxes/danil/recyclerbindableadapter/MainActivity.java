package com.princeparadoxes.danil.recyclerbindableadapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.princeparadoxes.danil.recyclerbindableadapter.grid.GridExampleActivity;
import com.princeparadoxes.danil.recyclerbindableadapter.linear.LinearExampleActivity;
import com.princeparadoxes.danil.recyclerbindableadapter.parallax.ParallaxExampleActivity;
import com.princeparadoxes.danil.recyclerbindableadapter.simple.SimpleExampleActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.main_activity_linear_example_button)
    protected void onLinearButtonClick() {
        this.startActivity(new Intent(this, LinearExampleActivity.class));
    }

    @OnClick(R.id.main_activity_grid_example_button)
    protected void onGridButtonClick() {
        this.startActivity(new Intent(this, GridExampleActivity.class));
    }

    @OnClick(R.id.main_activity_simple_example_button)
    protected void onSimpleButtonClick() {
        this.startActivity(new Intent(this, SimpleExampleActivity.class));
    }

    @OnClick(R.id.main_activity_parallax_example_button)
    protected void onParallaxButtonClick() {
        this.startActivity(new Intent(this, ParallaxExampleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);
    }
}
