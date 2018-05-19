package com.rePUB.rePUB.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class AnnotationCollection(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val collectionId: Long = 0,

        var bookId: String,
        var ownerId: Long,

        @get: NotBlank
        val name: String = ""

)
