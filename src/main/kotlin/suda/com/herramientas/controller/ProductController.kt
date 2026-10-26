package suda.com.herramientas.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import suda.com.herramientas.model.Product
import suda.com.herramientas.service.ProductService

@RestController
open class ProductController {

    @Autowired
    open lateinit var productService: ProductService

    @GetMapping("/hola")
    open fun saludo(): String {
        return "Hola mundo"
    }

    @GetMapping("/adios")
    open fun despedida(): String {
        return "Adios mundo"
    }

    @GetMapping("/saludoService")
    open fun saludoService(): String {
        return this.productService.saludoService()
    }

    @GetMapping("/productos")
    open fun listar(): List<Product> {
        return productService.listar()
    }
}