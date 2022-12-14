package com.mirea.authorservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Author(
    @Id
    val id: UUID?,
    val authorName: String,
    val authorSurname: String,
    val authorCountry: String
)