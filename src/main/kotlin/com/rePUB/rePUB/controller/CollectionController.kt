package com.rePUB.rePUB.controller


import com.rePUB.rePUB.model.AnnotationCollection
import com.rePUB.rePUB.model.Book
import com.rePUB.rePUB.model.User
import com.rePUB.rePUB.repository.CollectionRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
@RestController
@RequestMapping("/api")
class CollectionController(private val collectionRepository: CollectionRepository) {

    @GetMapping("/collection")
    fun getAllCollections(): List<AnnotationCollection> =
            collectionRepository.findAll()


    @PostMapping("/collection")
    fun createNewCollection(@Valid @RequestBody AnnotationCollection: AnnotationCollection): AnnotationCollection {
        collectionRepository.save(AnnotationCollection)

    }



}

