package com.ahasanidea.kodeindependencyinjection.ui.notes

import androidx.lifecycle.ViewModel
import com.ahasanidea.kodeindependencyinjection.data.model.Note
import com.ahasanidea.kodeindependencyinjection.data.repository.NoteRepository

class NoteViewModel(
    val noteRepository: NoteRepository
) : ViewModel() {
    fun addNote(note:Note){
        noteRepository.addNote(note)
    }
    fun getNotes()=noteRepository.getNotes()
}