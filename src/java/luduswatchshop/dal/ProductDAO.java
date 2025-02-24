package luduswatchshop.dal;

import java.util.ArrayList;
import java.util.List;
import luduswatchshop.model.Product;
import luduswatchshop.model.Category;
import luduswatchshop.model.Supplier;
import luduswatchshop.utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ProductDAO extends DBContext {
    private static final Logger LOGGER = Logger.getLogger(ProductDAO.class.getName());
    private CategoryDAO cd = new CategoryDAO();
    private SupplierDAO sd = new SupplierDAO();

    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[Products]";
        try (PreparedStatement st = connection.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            while (rs.next()) {
                String image = rs.getString("image");
                String[] images = image.split(",");
                Category c = cd.getCategoryById(rs.getInt("CategoryID"));
                Supplier s = sd.getSupplierById(rs.getInt("SupplierID"));
                double salePrice = getSalePrice(rs.getDouble("UnitPrice"), rs.getDouble("Discount"));
                Product p = new Product(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("DialColor"),
                        rs.getString("CaseSize"),
                        rs.getString("Movement"),
                        rs.getDouble("UnitPrice"),
                        rs.getInt("UnitsInStock"),
                        rs.getInt("StarRating"),
                        rs.getDouble("Discount"),
                        images,
                        rs.getDate("releaseDate"),
                        salePrice,
                        c, s);
                list.add(p);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching products", e);
        }
        return list;
    }

    private double getSalePrice(double unitPrice, double discount) {
        return unitPrice * (1 - discount);
    }
}
