package suda.com.herramientas.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import suda.com.herramientas.model.Product
import suda.com.herramientas.service.ProductService

@RestController
@RequestMapping("/product")
open class ProductController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    open fun listar(): List<Product> {
        return productService.listar()
    }

    @PostMapping
    open fun crear(@RequestBody product: Product): Product {
        return productService.crear(product)
    }

    @PatchMapping("/{id}")
    open fun actualizar(@PathVariable id: Int, @RequestBody product: Product): Product {
        return productService.actualizar(product, id)
    }

    @DeleteMapping("/{id}")
    open fun eliminar(@PathVariable id: Int) {
        productService.eliminar(id)
    }
}