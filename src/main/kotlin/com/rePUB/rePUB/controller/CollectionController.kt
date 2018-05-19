package com.rePUB.rePUB.controller


import com.rePUB.rePUB.model.AnnotationCollection
import com.rePUB.rePUB.repository.CollectionRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class CollectionController(private val collectionRepository: CollectionRepository) {


    @GetMapping("/collections")
    fun getAllCollections(): List<AnnotationCollection> =
        collectionRepository.findAll()


    @PostMapping("/collections")
    fun createNewCollection(@RequestBody AnnotationCollection: AnnotationCollection): AnnotationCollection =
        collectionRepository.save(AnnotationCollection)




}
