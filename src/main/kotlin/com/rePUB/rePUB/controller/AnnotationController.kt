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

    @GetMapping("/Annotations")
    fun getAllAnnotations(): List<Annotation> =
            AnnotationRepository.findAll()


    @PostMapping("/Annotations")
    fun createNewAnnotation(@Valid @RequestBody Annotation: Annotation): Annotation =
            AnnotationRepository.save(Annotation)


    @GetMapping("/Annotations/{id}")
    fun getAnnotationById(@PathVariable(value = "id") AnnotationId: Long): ResponseEntity<Annotation> {
        return AnnotationRepository.findById(AnnotationId).map { Annotation ->
            ResponseEntity.ok(Annotation)
        }.orElse(ResponseEntity.notFound().build())
    }
//
//    @PutMapping("/Annotations/{id}")
//    fun updateAnnotationById(@PathVariable(value = "id") AnnotationId: Long,
//                          @Valid @RequestBody newAnnotation: Annotation): ResponseEntity<Annotation> {
//
//        return AnnotationRepository.findById(AnnotationId).map { existingAnnotation ->
//            val updatedAnnotation: Annotation = existingAnnotation
//                    .copy(title = newAnnotation.title, content = newAnnotation.content)
//            ResponseEntity.ok().body(AnnotationRepository.save(updatedAnnotation))
//        }.orElse(ResponseEntity.notFound().build())
//
//    }

    @DeleteMapping("/Annotations/{id}")
    fun deleteAnnotationById(@PathVariable(value = "id") AnnotationId: Long): ResponseEntity<Void> {

        return AnnotationRepository.findById(AnnotationId).map { Annotation  ->
            AnnotationRepository.delete(Annotation)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }
}
