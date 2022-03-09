package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantty, Double price, Product product) {
        this.quantity = quantty;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantty() {
        return quantity;
    }

    public void setQuantty(Integer quantty) {
        this.quantity = quantty;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}

