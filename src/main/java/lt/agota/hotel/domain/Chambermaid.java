package lt.agota.hotel.domain;

import java.util.LinkedList;
import java.util.List;

public class Chambermaid extends Employee {
   private List<Room> roomList;

    public Chambermaid(String name, String surname, int id, List<Room> roomList){
        super(name, surname, id);
        this.roomList = roomList;
    }

}
