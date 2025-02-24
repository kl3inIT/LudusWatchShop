package luduswatchshop.model;

import java.sql.Date;

public class Product {

    private int productID;         // Product ID
    private String name;           // Product name
    private String dialColor;      // Dial color
    private String caseSize;       // Case size
    private String movement;       // Movement type
    private double price;          // Price
    private int quantity;          // Quantity in stock
    private int starRating;        // Star rating
    private double discount;       // Discount
    private String[] image;        // Array of image URLs
    private Date releaseDate;      // Release date
    private double salePrice;      // Sale price
    private Category category;      // Associated category
    private Brand brand;           // Associated brand

    // Default constructor
    public Product() {
    }

    // Constructor with parameters
    public Product(int productID, String name, String dialColor, String caseSize, String movement, double price, int quantity, int starRating, double discount, String[] image, Date releaseDate, double salePrice, Category category, Brand brand) {
        this.productID = productID;
        this.name = name;
        this.dialColor = dialColor;
        this.caseSize = caseSize;
        this.movement = movement;
        this.price = price;
        this.quantity = quantity;
        this.starRating = starRating;
        this.discount = discount;
        this.image = image;
        this.releaseDate = releaseDate;
        this.salePrice = salePrice;
        this.category = category;
        this.brand = brand;
    }

    // Getters and Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDialColor() {
        return dialColor;
    }

    public void setDialColor(String dialColor) {
        this.dialColor = dialColor;
    }

    public String getCaseSize() {
        return caseSize;
    }

    public void setCaseSize(String caseSize) {
        this.caseSize = caseSize;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String[] getImage() {
        return image;
    }

    public void setImage(String[] image) {
        this.image = image;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{"
                + "productID=" + productID
                + ", name='" + name + '\''
                + ", dialColor='" + dialColor + '\''
                + ", caseSize='" + caseSize + '\''
                + ", movement='" + movement + '\''
                + ", price=" + price
                + ", quantity=" + quantity
                + ", starRating=" + starRating
                + ", discount=" + discount
                + ", image=" + String.join(", ", image)
                + ", releaseDate=" + releaseDate
                + ", salePrice=" + salePrice
                + ", category=" + category
                + ", brand=" + brand
                + '}';
    }
}
