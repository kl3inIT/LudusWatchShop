
package luduswatchshop.dal;

import java.util.ArrayList;
import java.util.List;
import luduswatchshop.model.Brand;
import luduswatchshop.utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Admin
 */
public class BrandDAO extends DBContext {
    private static final Logger LOGGER = Logger.getLogger(BrandDAO.class.getName());

    public List<Brand> getAll() {
        List<Brand> brandList = new ArrayList<>();
        String sql = "SELECT BrandID, BrandName, Country, BrandImage, Phone, HomePage FROM Brands";
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Brand brand = new Brand();
                brand.setBrandID(rs.getInt("BrandID"));
                brand.setBrandName(rs.getString("BrandName"));
                brand.setCountry(rs.getString("Country"));
                brand.setBrandImage(rs.getString("BrandImage"));
                brand.setPhone(rs.getString("Phone"));
                brand.setHomePage(rs.getString("HomePage"));
                brandList.add(brand);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching brand", e);
        }
        return brandList;
    }

    public Brand getBrandById(int id) {
        String sql = "SELECT BrandID, BrandName, Country, BrandImage, Phone, HomePage FROM Brands WHERE BrandID = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Brand brand = new Brand();
                    brand.setBrandID(rs.getInt("BrandID"));
                    brand.setBrandName(rs.getString("BrandName"));
                    brand.setCountry(rs.getString("Country"));
                    brand.setBrandImage(rs.getString("BrandImage"));
                    brand.setPhone(rs.getString("Phone"));
                    brand.setHomePage(rs.getString("HomePage"));
                    return brand;
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, String.format("Error fetching brand with ID %d: %s", id, e.getMessage()), e);
        }
        return null;
    }
}
