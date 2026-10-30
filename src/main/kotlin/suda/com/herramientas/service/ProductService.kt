package suda.com.herramientas.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import suda.com.herramientas.model.Product
import suda.com.herramientas.repository.ProductRepository

@Service
open class ProductService {

    @Autowired
    lateinit var productRepository: ProductRepository

    open fun listar(): List<Product> {
        return productRepository.findAll()
    }

    open fun crear(product: Product): Product {
        if (product.nombre.isNullOrBlank()) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "El nombre es obligatorio")
        }
        return productRepository.save(product)
    }

    open fun actualizar(product: Product, id: Int): Product {
        val existing = productRepository.findById(id)
        if (existing.isEmpty) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado")
        }
        val existingProduct = existing.get()
        existingProduct.nombre = product.nombre
        existingProduct.descripcion = product.descripcion
        existingProduct.precio = product.precio
        return productRepository.save(existingProduct)
    }

    open fun eliminar(id: Int) {
        if (!productRepository.existsById(id)) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado")
        }
        productRepository.deleteById(id)
    }
}