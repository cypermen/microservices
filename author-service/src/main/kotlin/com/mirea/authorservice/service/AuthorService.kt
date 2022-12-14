package com.mirea.authorservice.service

import com.mirea.authorservice.entity.Author
import com.mirea.authorservice.repository.AuthorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthorService(
    private val authorRepository: AuthorRepository
) {
    fun saveAuthor(author: Author): Author {
        return authorRepository.save(author)
    }

    fun findAuthorById(authorId: UUID?): Author? {
        return authorRepository.findById(authorId)
    }
}