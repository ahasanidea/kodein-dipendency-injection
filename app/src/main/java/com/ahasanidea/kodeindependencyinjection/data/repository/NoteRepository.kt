package com.ahasanidea.kodeindependencyinjection.data.repository

import androidx.lifecycle.LiveData
import com.ahasanidea.kodeindependencyinjection.data.model.Note

interface NoteRepository {
    fun addNote(note:Note)
    fun getNotes():LiveData<List<Note>>
}