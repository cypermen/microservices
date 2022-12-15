package com.mirea.authorservice.controller

import com.mirea.authorservice.entity.Author
import com.mirea.authorservice.service.AuthorService
import io.opentracing.Span

import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/author")
class AuthorController(
    private val authorService: AuthorService,

) {

    @PostMapping("/add/")
    fun saveAuthor(@RequestParam name: String, surname: String, country: String): Author {
        return authorService.saveAuthor(
            Author(
                id = UUID.randomUUID(),
                authorName = name,
                authorSurname = surname,
                authorCountry = country
            )
        )
    }

    @GetMapping("/find/{id}")
    fun findAuthorById(@PathVariable("id") authorId: String): Author? {
        return authorService.findAuthorById(UUID.fromString(authorId))
    }
    @GetMapping ("/__health/")
    fun  checkHealth():Boolean{
        return true
    }
}