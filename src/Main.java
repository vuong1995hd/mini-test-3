import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialManager manager = new MaterialManager();


        manager.addMaterial(new CrispyFlour("CF01", "Crispy Flour 1", LocalDate.now(), 10, 50));
        manager.addMaterial(new CrispyFlour("CF02", "Crispy Flour 2", LocalDate.now(), 12, 40));
        manager.addMaterial(new CrispyFlour("CF03", "Crispy Flour 3", LocalDate.now(), 15, 30));
        manager.addMaterial(new CrispyFlour("CF04", "Crispy Flour 4", LocalDate.now(), 10, 20));
        manager.addMaterial(new CrispyFlour("CF05", "Crispy Flour 5", LocalDate.now(), 20, 10));


        manager.addMaterial(new Meat("M01", "Meat 1", LocalDate.now(), 50, 2.5));
        manager.addMaterial(new Meat("M02", "Meat 2", LocalDate.now(), 60, 1.5));
        manager.addMaterial(new Meat("M03", "Meat 3", LocalDate.now(), 55, 1.0));
        manager.addMaterial(new Meat("M04", "Meat 4", LocalDate.now(), 70, 3.0));
        manager.addMaterial(new Meat("M05", "Meat 5", LocalDate.now(), 65, 2.0));


        System.out.println("Tổng tiền của 10 vật liệu: " + manager.calculateTotalAmount());


        manager.sortMaterialsByPrice();
        System.out.println("Danh sách vật liệu sau khi sắp xếp:");
        manager.displayMaterials();


        System.out.println("Số chênh lệch giữa chiết khấu và không chiết khấu: " + manager.calculateDiscountDifference());
    }
}

