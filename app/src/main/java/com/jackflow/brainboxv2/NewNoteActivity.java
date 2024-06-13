package com.jackflow.brainboxv2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jackflow.brainboxv2.model.Note;

public class NewNoteActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY_TITLE = "com.example.android.notelistsql.REPLY_TITLE";
    public static final String EXTRA_REPLY_TEXT = "com.example.android.notelistsql.REPLY_TEXT";

    private EditText mEditNoteTitleView;
    private EditText mEditNoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        mEditNoteTitleView = findViewById(R.id.edit_title);
        mEditNoteTextView = findViewById(R.id.edit_text);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditNoteTitleView.getText()) || TextUtils.isEmpty(mEditNoteTextView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String title = mEditNoteTitleView.getText().toString();
                String text = mEditNoteTextView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY_TITLE, title);
                replyIntent.putExtra(EXTRA_REPLY_TEXT, text);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}