package com.rePUB.rePUB.repository

import com.rePUB.rePUB.model.AnnotationCollection
import com.rePUB.rePUB.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository



@Repository
interface CollectionRepository : JpaRepository<AnnotationCollection, Long>