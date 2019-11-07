package com.example.android.waitlist.data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.waitlist.MainActivity;
import com.example.android.waitlist.R;

public class AddFilmActivity extends AppCompatActivity {

    private Film currentFilm;
    private EditText titleET;
    private EditText resumeET;
    private EditText storyRateET;
    private EditText realRateET;
    private EditText musicRateET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);

        titleET = findViewById(R.id.film_title_et);
        resumeET = findViewById(R.id.film_resume_et);
        storyRateET = findViewById(R.id.story_rate_et);
        realRateET = findViewById(R.id.real_rate_et);
        musicRateET = findViewById(R.id.music_rate_et);
    }

    public void addNewFilm(View view){
        Intent myInt = new Intent(this, MainActivity.class);

        currentFilm = new Film();
        currentFilm.setTitle(titleET.getText().toString());
        currentFilm.setResume(resumeET.getText().toString());
        currentFilm.setStoryRate(Float.parseFloat(storyRateET.getText().toString()));
        currentFilm.setMusicRate(Float.parseFloat(musicRateET.getText().toString()));
        currentFilm.setRealRate(Float.parseFloat(realRateET.getText().toString()));

        currentFilm.setGlobalRate((currentFilm.getStoryRate() + currentFilm.getMusicRate() + currentFilm.getRealRate()) / 3);

        Bundle bundle = new Bundle();
        bundle.putSerializable("myFilm", currentFilm);
        myInt.putExtras(bundle);
        startActivity(myInt);
    }
}
