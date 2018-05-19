package com.rePUB.rePUB.repository


import com.rePUB.rePUB.model.Annotation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnnotationRepository : JpaRepository<Annotation, Long>