package com.ahasanidea.kodeindependencyinjection.data.repository

import androidx.lifecycle.LiveData
import com.ahasanidea.kodeindependencyinjection.data.db.NoteDao
import com.ahasanidea.kodeindependencyinjection.data.model.Note

class NoteRepositoryImpl(
    val noteDao: NoteDao
) : NoteRepository {
    override fun addNote(note: Note) {
        noteDao.addNote(note)
    }

    override fun getNotes()=noteDao.getNotes()
}