package com.example.gd5_a_10610.room

import androidx.room.*
import com.example.gd5_a_10610.room.Note

@Dao
interface NoteDao {
    @Insert
    suspend fun addNote(note: Note)
    @Update
    suspend fun updateNote(note: Note)
    @Delete
    suspend fun deleteNote(note: Note)
    @Query("SELECT * FROM note")
    suspend fun getNotes() : List<Note>
    @Query("SELECT * FROM note WHERE id =:note_id")
    suspend fun getNote(note_id: Int) : List<Note>
}