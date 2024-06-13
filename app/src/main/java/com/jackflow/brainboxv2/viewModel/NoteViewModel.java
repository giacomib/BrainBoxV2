package com.jackflow.brainboxv2.viewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.jackflow.brainboxv2.repository.NoteRepository;
import com.jackflow.brainboxv2.model.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository mRepository;

    private final LiveData<List<Note>> mAllNotes;

    public NoteViewModel (Application application) {
        super(application);
        mRepository = new NoteRepository(application);
        mAllNotes = mRepository.getAllNotes();
    }

    public LiveData<List<Note>> getAllNotes() { return mAllNotes; }

    public void insert(Note note) { mRepository.insert(note); }
}
