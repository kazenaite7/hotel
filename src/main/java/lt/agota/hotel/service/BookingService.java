package lt.agota.hotel.service;

import lt.agota.hotel.domain.Customer;
import lt.agota.hotel.domain.Room;
import lt.agota.hotel.domain.RoomStatus;

import java.util.List;

import static lt.agota.hotel.domain.RoomStatus.OCCUPPIED;

public class BookingService{

public static Room assignRoom(Customer customer, List<Room> roomList) {
    for (Room room : roomList) {
        Room assignedRoom = assignRoom(customer, room);
        if(assignedRoom!=null){
            return assignedRoom;
        }
    }
    return null;
}

    public static Room assignRoom(Customer customer, Room room) {

        if (room.getStatus() == RoomStatus.VACANT && room.getGuests() == customer.getGuests() && room.getNumber() == customer.getRoomNumber() ) {
            customer.setRoom(room);
            room.setStatus(OCCUPPIED);
            return room;
        }
        return null;
    }
}
