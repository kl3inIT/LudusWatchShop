package luduswatchshop.model;

import java.sql.Date;

public class Product {

    private int id;
    private String name;
    private String dialColor;
    private String caseSize;
    private String movement;
    private double price;
    private int quantity;
    private int starRating;
    private double discount;
    private String[] image;
    private Date releaseDate;
    private double salePrice;
    private Category category;
    private Supplier supplier;

    public Product() {
    }

    public Product(int id, String name, String dialColor, String caseSize, String movement, double price, int quantity, int starRating, double discount, String[] image, Date releaseDate, double salePrice, Category category, Supplier supplier) {
        this.id = id;
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
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", dialColor=" + dialColor + ", caseSize=" + caseSize + ", movement=" + movement + ", price=" + price + ", quantity=" + quantity + ", starRating=" + starRating + ", discount=" + discount + ", image=" + image + ", releaseDate=" + releaseDate + ", salePrice=" + salePrice + ", category=" + category + ", supplier=" + supplier + '}';
    }

}
