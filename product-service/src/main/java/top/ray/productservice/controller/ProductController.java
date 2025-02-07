package top.ray.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RAY
 */
@RestController
public class ProductController {
    @GetMapping("/product")
    public String getProduct(@RequestParam String productId) {
        // 模拟产品信息
        return "Product: " + productId;
    }

}
