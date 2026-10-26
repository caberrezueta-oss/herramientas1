package suda.com.herramientas.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "producto")
open class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    open val id: Int? = null,
    open val descripcion: String? = null,
    open val price: String? = null,
    open val stock: Int? = null
)