package com.ahasanidea.kodeindependencyinjection.data.db

class DatabaseFakeImpl : Database {
    override val noteDao: NoteDao=NoteDaoFakeImpl()
}