package com.mirea.authorservice.repository

import com.mirea.authorservice.entity.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface AuthorRepository : JpaRepository<Author?, UUID?> {
    fun findById(id: UUID?): Author?
}