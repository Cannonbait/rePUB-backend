package com.rePUB.rePUB.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Annotation(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val annotationId: Long = 0,

        val book_isbn: String = "",
        val collection_id: Long = 0,
        val user_id: Long = 0,

        @get: NotBlank
        val location: String = "",
        @get: NotBlank
        val content: String = ""

)
