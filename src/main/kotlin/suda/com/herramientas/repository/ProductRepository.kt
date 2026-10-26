package suda.com.herramientas.repository

import org.springframework.data.jpa.repository.JpaRepository
import suda.com.herramientas.model.Product

interface ProductRepository : JpaRepository<Product, Int>