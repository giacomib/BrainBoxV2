package com.jackflow.brainboxv2.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.jackflow.brainboxv2.model.Note;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(Note note);

    @Query("DELETE FROM note_table")
    void deleteAll();

    @Query("SELECT * FROM note_table ORDer BY title ASC")
    LiveData<List<Note>> getAlphabetizedNotes();
}
