package co.caliza.sample.custommethods.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/users")
class CustomMethodSampleController(
    var user: User = User(1, false),
    val listOfUsers: List<User> = listOf(user)
) {

    @PostMapping("/{id}:enable")
    fun enableUser(@PathVariable id: Int): ResponseEntity<User> {
        var currentUser = findUser(id)
        currentUser?.enabled = true
        return ResponseEntity.ok(user)
    }

    @PostMapping("/{id}:disable")
    fun disableUser(@PathVariable id: Int): ResponseEntity<User> {
        var currentUser = findUser(id)
        currentUser?.enabled = false
        return ResponseEntity.ok(user)
    }

    private fun findUser(id: Int): User? {
        return listOfUsers.find { it.id == id }
    }

    data class User(
        val id: Int,
        var enabled: Boolean,
    )
}
