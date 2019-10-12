package com.sun.noteapp.ui.textnote

import com.sun.noteapp.data.model.Note

interface TextNoteContract {
    interface View {
        fun backToListNote()
    }

    interface Presenter {
        fun addNote(note: Note)
        fun editNote(id: Int, note: Note)
    }
}
