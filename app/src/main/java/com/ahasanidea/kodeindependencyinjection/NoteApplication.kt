package com.ahasanidea.kodeindependencyinjection

import android.app.Application
import com.ahasanidea.kodeindependencyinjection.data.db.Database
import com.ahasanidea.kodeindependencyinjection.data.db.DatabaseFakeImpl
import com.ahasanidea.kodeindependencyinjection.data.db.NoteDao
import com.ahasanidea.kodeindependencyinjection.data.repository.NoteRepository
import com.ahasanidea.kodeindependencyinjection.data.repository.NoteRepositoryImpl
import com.ahasanidea.kodeindependencyinjection.ui.notes.NoteViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class NoteApplication() : Application(),KodeinAware {
    override val kodein= Kodein.lazy {
        bind<Database>() with singleton {DatabaseFakeImpl()}
        bind<NoteDao>() with singleton { instance<Database>().noteDao }
        bind<NoteRepository>() with singleton { NoteRepositoryImpl(instance()) }
        bind() from  provider { NoteViewModelFactory(instance()) }

    }

}