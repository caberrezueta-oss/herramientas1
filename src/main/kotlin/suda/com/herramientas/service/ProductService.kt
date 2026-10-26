package suda.com.herramientas.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import suda.com.herramientas.model.Product
import suda.com.herramientas.repository.ProductRepository

@Service
open class ProductService {

    @Autowired
    open lateinit var productRepository: ProductRepository

    open fun saludoService(): String {
        return "Hola desde el servicio"
    }

    open fun listar(): List<Product> {
        return productRepository.findAll()
    }
}