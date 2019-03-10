package com.ahasanidea.kodeindependencyinjection.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ahasanidea.kodeindependencyinjection.data.model.Note

class NoteDaoFakeImpl : NoteDao {
    private val noteList= mutableListOf<Note>()
    private val notes=MutableLiveData<List<Note>>()
    init {
        notes.value=noteList
    }
    override fun addNote(note: Note) {
        noteList.add(note)
        notes.value=noteList
    }

    override fun getNotes()=notes as LiveData<List<Note>>
}