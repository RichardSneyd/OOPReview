package buildings;
import java.util.List;

public class Building {
    private Address address;
    private List<Room> rooms;

    public Building(Address address, List<Room> rooms) {
        this.address = address;
        this.rooms = rooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
