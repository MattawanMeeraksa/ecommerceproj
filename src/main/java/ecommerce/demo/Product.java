package ecommerce.demo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    @NotBlank
    private String productName;

    private String type;
    private double price;
    private String productDescription;

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
