package com.example.bichriganadero.dao

import com.example.bichriganadero.model.Feeding

interface FeedingDao {
    // Insert a new feeding record
    fun insert(feeding: Feeding)

    // Update an existing feeding record
    fun update(feeding: Feeding)

    // Delete a feeding record by id
    fun delete(feedingId: Long)

    // Query feeding records by cow and date
    fun queryFeedingByCowAndDate(cowId: Long, date: String): List<Feeding>
}