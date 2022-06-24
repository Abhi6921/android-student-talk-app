package com.abhicoder.student_talk_app.feature_note.domain.use_case

import com.abhicoder.student_talk_app.feature_note.domain.model.Note
import com.abhicoder.student_talk_app.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}