package luduswatchshop.model;

public class Supplier {

    private int id;
    private String supplierName;
    private String country;
    private String image;
    private String phone;
    private String homepage;

    public Supplier() {
    }

    public Supplier(int id, String supplierName, String country, String image, String phone, String homepage) {
        this.id = id;
        this.supplierName = supplierName;
        this.country = country;
        this.image = image;
        this.phone = phone;
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", supplierName=" + supplierName + ", country=" + country + ", image=" + image + ", phone=" + phone + ", homepage=" + homepage + '}';
    }
}
