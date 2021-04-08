package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.notes.models.Note;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="my" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Note note = new Note ( "title","content","time" );
        Log.d ( TAG , "onCreate:myNote: " + note.toString () );

    }
}