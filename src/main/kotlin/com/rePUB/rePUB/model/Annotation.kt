package com.rePUB.rePUB.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Annotation(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val annotationId: Long = 0,

        val isbn: String = "",
        val collectionId: Long = 0,
        val userId: Long = 0,
        @get: NotBlank
        val location: String = "",
        @get: NotBlank
        val content: String = ""

)
