package com.rePUB.rePUB.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class AnnotationCollection(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val collectionId: Long = 0,

        @ManyToOne
        val bookId: Book,
        @ManyToOne
        val owner: User,

        @get: NotBlank
        val name: String = ""

)
