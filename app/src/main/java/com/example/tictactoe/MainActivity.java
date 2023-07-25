package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView row1col1,row1col2,row1col3,row2col1,row2col2,row2col3,row3col1,row3col2,row3col3;
    private TextView player_turn;
    private boolean gameOver = false;
    private int currentPlayer = 0;
    String checkEmpty = "";
    // 0 = O
    // 1 = X

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        row1col1 = findViewById(R.id.row1col1);
        row1col2 = findViewById(R.id.row1col2);
        row1col3 = findViewById(R.id.row1col3);

        row2col1 = findViewById(R.id.row2col1);
        row2col2 = findViewById(R.id.row2col2);
        row2col3 = findViewById(R.id.row2col3);

        row3col1 = findViewById(R.id.row3col1);
        row3col2 = findViewById(R.id.row3col2);
        row3col3 = findViewById(R.id.row3col3);
        player_turn = findViewById(R.id.player_turn);

        row1col1.setOnClickListener(this);
        row1col2.setOnClickListener(this);
        row1col3.setOnClickListener(this);

        row2col1.setOnClickListener(this);
        row2col2.setOnClickListener(this);
        row2col3.setOnClickListener(this);

        row3col1.setOnClickListener(this);
        row3col2.setOnClickListener(this);
        row3col3.setOnClickListener(this);

        Button resetGame = findViewById(R.id.reset_button);
        resetGame.setOnClickListener(view -> {
            gameOver = false;
            // all textviews becomes empty
            row1col1.setText("");
            row1col2.setText("");
            row1col3.setText("");

            row2col1.setText("");
            row2col2.setText("");
            row2col3.setText("");

            row3col1.setText("");
            row3col2.setText("");
            row3col3.setText("");
        });
    }

    @Override
    public void onClick(View view) {
        if (!gameOver) {
            switch (view.getId()) {
                case R.id.row1col1:
                    if (checkEmpty.equals(row1col1.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row1col1.getText().toString())) {
                            currentPlayer = 1;
                            row1col1.setText("O");
                        } else {
                            currentPlayer = 0;
                            row1col1.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row1col2:
                    if (checkEmpty.equals(row1col2.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row1col2.getText().toString())) {
                            currentPlayer = 1;
                            row1col2.setText("O");
                        } else {
                            currentPlayer = 0;
                            row1col2.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row1col3:
                    if (checkEmpty.equals(row1col3.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row1col3.getText().toString())) {
                            currentPlayer = 1;
                            row1col3.setText("O");
                        } else {
                            currentPlayer = 0;
                            row1col3.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row2col1:
                    if (checkEmpty.equals(row2col1.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row2col1.getText().toString())) {
                            currentPlayer = 1;
                            row2col1.setText("O");
                        } else {
                            currentPlayer = 0;
                            row2col1.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row2col2:
                    if (checkEmpty.equals(row2col2.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row2col2.getText().toString())) {
                            currentPlayer = 1;
                            row2col2.setText("O");
                        } else {
                            currentPlayer = 0;
                            row2col2.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row2col3:
                    if (checkEmpty.equals(row2col3.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row2col3.getText().toString())) {
                            currentPlayer = 1;
                            row2col3.setText("O");
                        } else {
                            currentPlayer = 0;
                            row2col3.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row3col1:
                    if (checkEmpty.equals(row3col1.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row3col1.getText().toString())) {
                            currentPlayer = 1;
                            row3col1.setText("O");
                        } else {
                            currentPlayer = 0;
                            row3col1.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row3col2:
                    if (checkEmpty.equals(row3col2.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row3col2.getText().toString())) {
                            currentPlayer = 1;
                            row3col2.setText("O");
                        } else {
                            currentPlayer = 0;
                            row3col2.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
                case R.id.row3col3:
                    if (checkEmpty.equals(row3col3.getText().toString())) {
                        if (player_turn.getText().toString().equals("Turn : O")) {
                            player_turn.setText("Turn : X");
                        } else {
                            player_turn.setText("Turn : O");
                        }
                        if (currentPlayer == 0 && checkEmpty.equals(row3col3.getText().toString())) {
                            currentPlayer = 1;
                            row3col3.setText("O");
                        } else {
                            currentPlayer = 0;
                            row3col3.setText("X");
                        }
                        gameOver = checkWinner();
                    }
                    break;
            }
        }
    }
    private boolean checkWinner(){
        // check rows for winner
        if (row1col1.getText().toString().equals(row1col2.getText().toString()) && row1col2.getText().toString().equals(row1col3.getText().toString()) && !row1col1.getText().toString().isEmpty()) {
            // check winner
            if (row1col1.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        else if (row2col1.getText().toString().equals(row2col2.getText().toString()) && row2col2.getText().toString().equals(row2col3.getText().toString()) && !row2col1.getText().toString().isEmpty()) {
            // check winner
            if (row2col1.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        else if (row3col1.getText().toString().equals(row3col2.getText().toString()) && row3col2.getText().toString().equals(row3col3.getText().toString()) && !row3col1.getText().toString().isEmpty()) {
            // check winner
            if (row3col1.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        // check for columns
        if (row1col1.getText().toString().equals(row2col1.getText().toString()) && row2col1.getText().toString().equals(row3col1.getText().toString()) && !row1col1.getText().toString().isEmpty()) {
            // check winner
            if (row1col1.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        else if (row1col2.getText().toString().equals(row2col2.getText().toString()) && row2col2.getText().toString().equals(row3col2.getText().toString()) && !row1col2.getText().toString().isEmpty()) {
            // check winner
            if (row1col2.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        else if (row1col3.getText().toString().equals(row2col3.getText().toString()) && row2col3.getText().toString().equals(row3col3.getText().toString()) && !row1col3.getText().toString().isEmpty()) {
            // check winner
            if (row1col3.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        // check your diagonal wins
        if (row1col1.getText().toString().equals(row2col2.getText().toString()) && row2col2.getText().toString().equals(row3col3.getText().toString()) && !row1col1.getText().toString().isEmpty()) {
            // check winner
            if (row1col1.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        else if (row1col3.getText().toString().equals(row2col2.getText().toString()) && row2col2.getText().toString().equals(row3col1.getText().toString()) && !row1col3.getText().toString().isEmpty()) {
            // check winner
            if (row1col3.getText().toString().equals("X")) {
                Toast.makeText(this, "X wins", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "O wins", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        return false;
    }
}