package com.esusu.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teamA,teamB;
    Button btnA,btnB,remA,remB;
    int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA=findViewById(R.id.textA);
        teamB=findViewById(R.id.textB);
        btnA=findViewById(R.id.btnA);
        btnB=findViewById(R.id.btnB);
        remA=findViewById(R.id.btnReA);
        remB=findViewById(R.id.btnReB);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DisplayTeamA();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayTeamB();
            }
        });
        remA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RemoveFromA();
            }
        });
        remB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              RemoveFrombB();
            }
        });
    }

    private void RemoveFrombB() {
        int rem = Integer.parseInt(String.valueOf(teamB.getText()));
        rem=rem-1;
        teamB.setText(Integer.toString(rem));
    }
    private void RemoveFromA() {
        int rem = Integer.parseInt(String.valueOf(teamA.getText()));
        rem=rem-1;
        teamA.setText(Integer.toString(rem));
    }
    private void DisplayTeamB() {
        scoreB=scoreB+1;
        teamB.setText(Integer.toString(scoreB));
    }

    private void DisplayTeamA() {
        scoreA=scoreA+1;
        teamA.setText(Integer.toString(scoreA));
    }
}
