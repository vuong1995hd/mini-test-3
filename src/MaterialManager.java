import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaterialManager {

    private List<Material> materials = new ArrayList<>();

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(id)) {
                materials.set(i, newMaterial);
                return;
            }
        }
        System.out.println("Material not found.");
    }

    public void deleteMaterial(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }

    public double calculateTotalAmount() {
        return materials.stream().mapToDouble(Material::getAmount).sum();
    }

    public void sortMaterialsByPrice() {
        materials.sort(Comparator.comparingDouble(Material::getAmount));
    }

    public double calculateDiscountDifference() {
        double totalOriginal = materials.stream().mapToDouble(Material::getAmount).sum();
        double totalDiscounted = materials.stream()
                .filter(material -> material instanceof Discount)
                .mapToDouble(material -> ((Discount) material).getRealMoney())
                .sum();
        return totalOriginal - totalDiscounted;
    }

    public void displayMaterials() {
        for (Material material : materials) {
            System.out.println(material + ", Amount: " + material.getAmount());
        }
    }
}

