package lt.agota.hotel.service;

import lt.agota.hotel.domain.Room;

import java.util.List;

public interface ChambermaidService {
    List<Room> roomCleaningList(List<Room> roomList);
    void cleanRooms (List <Room> onChangeList);
}
