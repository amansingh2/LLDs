import java.time.LocalDateTime;

class Rental {

    public static void main(String args[]) {

        Address address = new Address("street", "city", "state", "zipcode", "country");
        Person p = new Person("Harsh", "h@g.com", "8758149799", address);
        Member harsh = new Member("id", "password", p, AccountStatus.ACTIVE, 5);

        Vehicle car = new Vehicle(1001, 4, "BMW", "sportz", LocalDateTime.now(), "none", VehicleCategory.CAR);
        car.addLogs("Accident");

        Vehicle mahindra = new Vehicle(1121, 6, "MAHINDRA", "XUV", LocalDateTime.now(), "none", VehicleCategory.SUV);

        // System.out.println(VehicleInventory.getAllVehicles());

        // testing search query
        for (Vehicle x : VehicleInventory.getAllVehicles()) {
            System.out.println(x.brand);
        }

    }
}