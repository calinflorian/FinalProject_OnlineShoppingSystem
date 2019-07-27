package sda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sda.model.ProductDetailsDTO;
import sda.services.ProductDetailsService;

import java.util.List;

@Controller
public class ProductDetailsController {

@Autowired
ProductDetailsService productDetailsService;

@GetMapping("/produs/{productId}")
    public String homePage(Model model, @PathVariable("productId") Integer productId){
    ProductDetailsDTO productById = productDetailsService.getProductsById(productId);

    model.addAttribute("productName", productById.productName);
    return "home";
}
@GetMapping("/produse")
    public String homePage(Model model){
    List<ProductDetailsDTO> allProductDetails=productDetailsService.getAllProducts();

    model.addAttribute("ProductDetails", allProductDetails);

            return "produse";
}
}