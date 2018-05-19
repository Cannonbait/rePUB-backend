package com.rePUB.rePUB.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Book(
        @Id @get: NotBlank
        val isbn: String = "",
        @get: NotBlank
        val title: String = "",
        @get: NotBlank
        val author: String = ""
)