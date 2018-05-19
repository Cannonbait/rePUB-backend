package com.rePUB.rePUB.controller

import com.rePUB.rePUB.model.Book
import com.rePUB.rePUB.repository.BookRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class BookController(private val BookRepository: BookRepository) {

    @GetMapping("/Books")
    fun getAllBooks(): List<Book> =
            BookRepository.findAll()


    @PostMapping("/Books")
    fun createNewBook(@Valid @RequestBody Book: Book): Book =
            BookRepository.save(Book)


    @GetMapping("/Books/{id}")
    fun getBookById(@PathVariable(value = "id") BookId: Long): ResponseEntity<Book> {
        return BookRepository.findById(BookId).map { Book ->
            ResponseEntity.ok(Book)
        }.orElse(ResponseEntity.notFound().build())
    }
}
