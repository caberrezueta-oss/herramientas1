package suda.com.herramientas.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "producto")
open class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Int? = null

    @Column(name = "nombre")
    open var nombre: String? = null

    @Column(name = "descripcion")
    open var descripcion: String? = null

    @Column(name = "precio")
    open var precio: Double? = null
}