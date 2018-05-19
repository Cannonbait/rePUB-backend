package com.rePUB.rePUB.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class AnnotationCollection(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val collectionId: Long = 0,
        val book_isbn: String = "",
        val user_id: Long = 0,
        @get: NotBlank
        val name: String = ""
)
