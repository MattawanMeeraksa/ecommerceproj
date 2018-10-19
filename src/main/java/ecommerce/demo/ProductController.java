package ecommerce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable(name ="id") long id){
        return productRepository.findById(id);
    }

    @GetMapping("/")
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
