package sda.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "productdetails")
public class ProductDetails {

    public ProductDetails(){}

    @Id
    @Column(name = "iDProductDetails",
            unique = true,
            nullable = false)
    @GeneratedValue
            (strategy = GenerationType.AUTO,
                    generator = "native")
    @GenericGenerator(name = "native",
            strategy = "native"
    )

    Integer idProductDetails;

    public Integer productCode;
    public String productName;
    public String productDescription;
    public Integer productPrice;
    public Integer productQuantity;


    @Override
    public String toString() {
        return "ProductDetailsRepository{" +
                "idProductDetails=" + idProductDetails +
                ", productCode=" + productCode +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                '}';
    }

}
