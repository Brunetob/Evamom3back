package com.example.evam3.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table (name="scene")
class Scene {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var description: String? = null
    var budget: Double? = null
    @Column(name="film_id")
    var filmId: Long? = null
    var minutes: Long? = null
}