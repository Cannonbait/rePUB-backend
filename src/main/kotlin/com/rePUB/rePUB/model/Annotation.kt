package com.rePUB.rePUB.model

import javax.persistence.Entity
import javax.persistence.ForeignKey
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Annotation(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val annotationId: Long = 0,

        @ForeignKey
        val isbn: String = "",
        @ForeignKey
        val collectionId: Long = 0,
        @ForeignKey
        val userid: Long = 0,

        @get: NotBlank
        val location: String = "",
        @get: NotBlank
        val content: String = ""

)
