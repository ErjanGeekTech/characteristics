package com.example.characteristics.ui.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.characteristics.R;
import com.example.characteristics.databinding.ActivityMainBinding;
import com.example.characteristics.players.CharacterizationPlayers;
import com.example.characteristics.singleton.Singleton;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getTextBuilder();

    }

    private void getTextBuilder() {
        binding.text.setText(Singleton.getInstance().now());

    }
}