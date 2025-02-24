package luduswatchshop.model;

public class Category {

    private int categoryID;        // Category ID
    private String categoryName;   // Category name
    private String description;     // Description

    // Default constructor
    public Category() {
    }

    // Constructor with parameters
    public Category(int categoryID, String categoryName, String description) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
    }

    // Getters and Setters
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{"
                + "categoryID=" + categoryID
                + ", categoryName='" + categoryName + '\''
                + ", description='" + description + '\''
                + '}';
    }

}
