package com.rePUB.rePUB.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Annotation(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val annotationId: Long = 0,

        @ManyToOne
        val isbn: Book,
        @ManyToOne
        val collectionId: Collection,
        @ManyToOne
        val userid: User,

        @get: NotBlank
        val location: String = "",
        @get: NotBlank
        val content: String = ""

)
