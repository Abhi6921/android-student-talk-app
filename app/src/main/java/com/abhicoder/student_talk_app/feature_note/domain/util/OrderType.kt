package com.abhicoder.student_talk_app.feature_note.domain.util

import androidx.room.FtsOptions

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
