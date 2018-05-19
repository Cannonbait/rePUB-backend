package com.rePUB.rePUB.controller


import com.fasterxml.jackson.databind.JsonNode
import com.rePUB.rePUB.model.AnnotationCollection
import com.rePUB.rePUB.repository.BookRepository
import com.rePUB.rePUB.repository.CollectionRepository
import com.rePUB.rePUB.repository.UserRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
@RestController
@RequestMapping("/api")
class CollectionController(private val collectionRepository: CollectionRepository) {

    @GetMapping("/collection")
    fun getAllCollections(): List<AnnotationCollection> =
            collectionRepository.findAll()


    @PostMapping("/collection")
    fun createNewCollection(@Valid @RequestBody annotationCollection: AnnotationCollection): AnnotationCollection {
        return collectionRepository.save(annotationCollection)
    }
}

