package hunglevan.ad.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtTeamASocre, txtTeamBScore;
    Button btnTeamA1Point, btnTeamA2Point, btnTeamA3Point, btnTeamB1Point, btnTeamB2Point, btnTeamB3Point, btnReset;
    int teamAScore = 0;
    int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapIdToView();
        setupView();
    }

    private void mapIdToView(){
        txtTeamASocre = findViewById(R.id.txt_teamA_score);
        txtTeamBScore = findViewById(R.id.txt_teamB_score);
        btnTeamA1Point = findViewById(R.id.btn_teamA_1point);
        btnTeamA2Point = findViewById(R.id.btn_teamA_2point);
        btnTeamA3Point = findViewById(R.id.btn_teamA_3point);
        btnTeamB1Point = findViewById(R.id.btn_teamB_1point);
        btnTeamB2Point = findViewById(R.id.btn_teamB_2point);
        btnTeamB3Point = findViewById(R.id.btn_teamB_3point);
        btnReset = findViewById(R.id.btn_reset);
    }

    private void setupView(){
        btnTeamA1Point.setOnClickListener(this);
        btnTeamA2Point.setOnClickListener(this);
        btnTeamA3Point.setOnClickListener(this);
        btnTeamB1Point.setOnClickListener(this);
        btnTeamB2Point.setOnClickListener(this);
        btnTeamB3Point.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }
    private void updateScore(){
        txtTeamASocre.setText(String.valueOf(teamAScore));
        txtTeamBScore.setText(String.valueOf(teamBScore));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_teamA_1point:
                teamAScore++;
                updateScore();
                break;
            case R.id.btn_teamA_2point:
                teamAScore += 2;
                updateScore();
                break;
            case R.id.btn_teamA_3point:
                teamAScore += 3;
                updateScore();
                break;
            case R.id.btn_teamB_1point:
                teamBScore++;
                updateScore();
                break;
            case R.id.btn_teamB_2point:
                teamBScore += 2;
                updateScore();
                break;
            case R.id.btn_teamB_3point:
                teamBScore += 3;
                updateScore();
                break;
            case R.id.btn_reset:
                teamAScore = teamBScore = 0;
                updateScore();
                break;
        }
    }
}




