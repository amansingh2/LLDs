import java.time.LocalDateTime;

class VehicleLog {

    public String id, description, type;
    public LocalDateTime creationDate;

    public VehicleLog(String id, String description, String type, LocalDateTime creationDate) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.creationDate = creationDate;
    }

    public void update(String id, String description, String type, LocalDateTime creationDate) {
        this.id = id;
        this.creationDate = creationDate;
        this.description = description;
        this.type = type;

    }

    public String searchByType(String type) {
        return description;
    }

}
