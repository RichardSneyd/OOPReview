package devices;
import buildings.Address;
import buildings.Building;
import buildings.Room;

import java.util.List;

public class App {

    public static void main(String[] args){
        // declared the variable (memory set aside)
        Device samsungPhone;
        // inititialze the variable
        samsungPhone = new SmartPhone(10,22,1000);
        System.out.println(samsungPhone.toString());


        Laptop laptop = new Laptop(30,33,320);
        System.out.println(laptop.toString());

        // simple composition example
        Building officeBuilding = new Building(new Address(23, "Fake Street", "NowhereVille"), List.of(new Room()));
        System.out.println(officeBuilding.getAddress());
    }




}
