package luduswatchshop.dal;

import java.util.ArrayList;
import java.util.List;
import luduswatchshop.model.Supplier;
import luduswatchshop.utils.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class SupplierDAO extends DBContext {
    private static final Logger LOGGER = Logger.getLogger(SupplierDAO.class.getName());

    public List<Supplier> getAll() {
        List<Supplier> supplierList = new ArrayList<>();
        String sql = "SELECT SupplierID, SupplierName, Country, SupplierImage, Phone, HomePage FROM Suppliers";
        try (PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Supplier supplier = new Supplier();
                supplier.setId(rs.getInt("SupplierID"));
                supplier.setSupplierName(rs.getString("SupplierName"));
                supplier.setCountry(rs.getString("Country"));
                supplier.setImage(rs.getString("Image"));
                supplier.setPhone(rs.getString("Phone"));
                supplier.setHomepage(rs.getString("HomePage"));
                supplierList.add(supplier);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error fetching suppliers", e);
        }
        return supplierList;
    }

    public Supplier getSupplierById(int id) {
        String sql = "SELECT SupplierID, SupplierName, Country, Image, Phone, HomePage FROM Suppliers WHERE SupplierID = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Supplier supplier = new Supplier();
                    supplier.setId(rs.getInt("SupplierID"));
                    supplier.setSupplierName(rs.getString("SupplierName"));
                    supplier.setCountry(rs.getString("Country"));
                    supplier.setImage(rs.getString("SupplierImage"));
                    supplier.setPhone(rs.getString("Phone"));
                    supplier.setHomepage(rs.getString("HomePage"));
                    return supplier;
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, String.format("Error fetching supplier with ID %d", id), e);
        }
        return null;
    }

}
