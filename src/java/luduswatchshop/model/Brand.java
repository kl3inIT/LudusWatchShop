package luduswatchshop.model;

public class Brand {

    private int brandID;
    private String brandName;
    private String country;
    private String brandImage;
    private String phone;
    private String homePage;

    public Brand() {
    }

    public Brand(int brandID, String brandName, String country, String brandImage, String phone, String homePage) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.country = country;
        this.brandImage = brandImage;
        this.phone = phone;
        this.homePage = homePage;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        this.brandImage = brandImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "Brand{"
                + "brandID=" + brandID
                + ", brandName='" + brandName + '\''
                + ", country='" + country + '\''
                + ", brandImage='" + brandImage + '\''
                + ", phone='" + phone + '\''
                + ", homePage='" + homePage + '\''
                + '}';
    }
}
