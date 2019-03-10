package com.ahasanidea.kodeindependencyinjection.ui.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ahasanidea.kodeindependencyinjection.data.repository.NoteRepository

class NoteViewModelFactory(
    val noteRepository: NoteRepository
) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoteViewModel(noteRepository) as T
    }
}