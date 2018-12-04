package lt.agota.hotel.service;

import lt.agota.hotel.domain.Room;

import java.util.List;

public interface RoomService {
    List<Room> loadRooms ();
    List<Room> roomsATM(List<Room> roomList);
}
