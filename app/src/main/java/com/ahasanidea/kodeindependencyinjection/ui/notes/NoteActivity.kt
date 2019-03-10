package com.ahasanidea.kodeindependencyinjection.ui.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ahasanidea.kodeindependencyinjection.R
import com.ahasanidea.kodeindependencyinjection.data.model.Note
import kotlinx.android.synthetic.main.activity_note.*
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance
import java.lang.StringBuilder

class NoteActivity : AppCompatActivity(), KodeinAware {
    override val kodein by org.kodein.di.android.kodein()
    private val viewModelFactory: NoteViewModelFactory by instance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)
        initializeUi()
    }

    private fun initializeUi() {
        val viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(NoteViewModel::class.java)

        viewModel.getNotes().observe(this, Observer { notes ->
            val stringBuilder = StringBuilder()
            notes.forEach {
                stringBuilder.append("$it\n\n")
            }
            textView_notes.text = stringBuilder.toString()
        })
        button_add_note.setOnClickListener {
            val note = Note(editText_title.text.toString(), editText_detail.text.toString())
            viewModel.addNote(note)
            editText_title.setText("")
            editText_detail.setText("")
        }
    }
}
