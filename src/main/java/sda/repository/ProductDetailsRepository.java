package sda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.entity.ProductDetails;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Integer> {

    ProductDetails findProductDetailsByProductName(String productName);

}