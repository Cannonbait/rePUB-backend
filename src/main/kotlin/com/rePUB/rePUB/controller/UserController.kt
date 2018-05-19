package com.rePUB.rePUB.controller


import com.rePUB.rePUB.model.User
import com.rePUB.rePUB.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/users")
    fun getAllUsers(): List<User> =
            userRepository.findAll()


    @PostMapping("/users")
    fun createNewUser(@Valid @RequestBody User: User): User =
            userRepository.save(User)

}
