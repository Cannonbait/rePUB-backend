package com.rePUB.rePUB.controller


import com.rePUB.rePUB.model.Annotation
import com.rePUB.rePUB.repository.AnnotationRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class AnnotationController(private val AnnotationRepository: AnnotationRepository) {

    @GetMapping("/annotations")
    fun getAllAnnotations(): List<Annotation> =
            AnnotationRepository.findAll()


    @PostMapping("/annotations")
    fun createNewAnnotation(@Valid @RequestBody Annotation: Annotation): Annotation =
            AnnotationRepository.save(Annotation)


    @GetMapping("/annotations/{id}")
    fun getAnnotationById(@PathVariable(value = "id") AnnotationId: Long): ResponseEntity<Annotation> {
        return AnnotationRepository.findById(AnnotationId).map { Annotation ->
            ResponseEntity.ok(Annotation)
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/annotations/{id}")
    fun deleteAnnotationById(@PathVariable(value = "id") AnnotationId: Long): ResponseEntity<Void> {

        return AnnotationRepository.findById(AnnotationId).map { Annotation  ->
            AnnotationRepository.delete(Annotation)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }
}
