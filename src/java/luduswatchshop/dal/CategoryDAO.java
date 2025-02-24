package luduswatchshop.dal;

import java.util.ArrayList;
import java.util.List;
import luduswatchshop.model.Category;
import luduswatchshop.utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class CategoryDAO extends DBContext {

    private static final Logger LOGGER = Logger.getLogger(CategoryDAO.class.getName());

    public List<Category> getAll() {
        List<Category> categoryList = new ArrayList<>();
        String sql = "SELECT CategoryID, CategoryName, Description FROM Categories";
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryID(rs.getInt("CategoryID"));
                category.setCategoryName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));
                categoryList.add(category);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching category", e);
        }
        return categoryList;
    }

    public Category getCategoryById(int id) {
        String sql = "SELECT CategoryID, CategoryName, Description FROM Categories WHERE CategoryID = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Category category = new Category();
                    category.setCategoryID(rs.getInt("CategoryID"));
                    category.setCategoryName(rs.getString("CategoryName"));
                    category.setDescription(rs.getString("Description"));
                    return category;
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, String.format("Error fetching category with ID %d", id), e);
        }
        return null;
    }
}
