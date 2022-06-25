package com.abhicoder.student_talk_app.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abhicoder.student_talk_app.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    // this section contains hardcoded set of values
    companion object {
        // colors to choose for node
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)

