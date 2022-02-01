package com.example.mytriviaapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class gameFragment extends Fragment implements View.OnClickListener {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        final NavController navController= Navigation.findNavController(view);
        Button button= getView().findViewById(R.id.button_game);
        Button radioButton =getView().findViewById(R.id.radioButton);
        Button radioButton1 = getView().findViewById(R.id.radioButton4);
        Button radioButton2 = getView().findViewById(R.id.radioButton2);
        Button radioButton3 = getView().findViewById(R.id.radioButton3);
         


        navController.navigate(R.id.action_gameFragment_to_gameOverFragment);
        navController.navigate(R.id.action_gameFragment_to_gameWinFragment);

        button.setOnClickListener(this);
        radioButton.setOnClickListener(this);
        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.radioButton:
                navController.navigate(R.id.action_gameFragment_to_gameOverFragment);

                break;
            case R.id.radioButton4:
                navController.navigate(R.id.action_gameFragment_to_gameOverFragment);
                break;
            case R.id.radioButton2:
                navController.navigate(R.id.action_gameFragment_to_gameOverFragment);
                break;
            case R.id.radioButton3:
                navController.navigate(R.id.action_gameFragment_to_gameWinFragment);
                break;
        }
    }
}