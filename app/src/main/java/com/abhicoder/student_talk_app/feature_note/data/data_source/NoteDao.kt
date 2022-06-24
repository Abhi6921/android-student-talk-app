package com.abhicoder.student_talk_app.feature_note.data.data_source

import androidx.room.*
import com.abhicoder.student_talk_app.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    // return by id so suspend fun
    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun  insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

}