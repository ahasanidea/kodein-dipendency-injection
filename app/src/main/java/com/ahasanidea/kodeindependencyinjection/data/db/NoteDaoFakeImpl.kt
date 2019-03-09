package com.ahasanidea.kodeindependencyinjection.data.db

import androidx.lifecycle.LiveData
import com.ahasanidea.kodeindependencyinjection.data.model.Note

class NoteDaoFakeImpl : NoteDao {
    override fun addNote(note: Note) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNote(): LiveData<List<Note>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}