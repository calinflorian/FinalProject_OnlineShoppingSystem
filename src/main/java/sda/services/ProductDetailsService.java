package sda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.entity.ProductDetails;
import sda.model.ProductDetailsDTO;
import sda.repository.ProductDetailsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductDetailsService {

    @Autowired
    ProductDetailsRepository productDetailsRepository;

    public ProductDetailsDTO getProductsById(Integer id){
        Optional<ProductDetails> byId = productDetailsRepository.findById(id);
    if (byId.isPresent()){
        return new ProductDetailsDTO(byId.get().productName);
    }
    return new ProductDetailsDTO("Nu exista");
    }
    public List<ProductDetailsDTO> getAllProducts() {
        List<ProductDetailsDTO> allProducts = new ArrayList<>();

        List<ProductDetails> all = productDetailsRepository.findAll();

        for (ProductDetails p : all) {
            allProducts.add(new ProductDetailsDTO(p.productName));
        }
        return allProducts;
    }

}
