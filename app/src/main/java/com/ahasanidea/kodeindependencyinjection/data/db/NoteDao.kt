package com.ahasanidea.kodeindependencyinjection.data.db

import androidx.lifecycle.LiveData
import com.ahasanidea.kodeindependencyinjection.data.model.Note

interface NoteDao {
    fun addNote(note:Note)
    fun getNote():LiveData<List<Note>>
}