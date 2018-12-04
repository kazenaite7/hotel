package lt.agota.hotel.service;

import lt.agota.hotel.domain.Room;
import lt.agota.hotel.repo.RoomRepo;

import java.util.LinkedList;
import java.util.List;

public class RoomServiceImpl implements RoomService {
    private RoomRepo roomRepo;

    public RoomServiceImpl(){
        roomRepo = new RoomRepo();
    }

    public List<Room> loadRooms (){
        return roomRepo.findAll();
    }

    public List<Room> roomsATM (List<Room> roomList){
        List<Room> roomListGUI = new LinkedList<>();
        for (Room room : roomList) {
            roomListGUI.add(room);
        }
        return roomListGUI;
    }
}
