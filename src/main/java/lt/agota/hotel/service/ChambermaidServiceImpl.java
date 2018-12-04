package lt.agota.hotel.service;

import lt.agota.hotel.domain.Room;
import lt.agota.hotel.domain.RoomStatus;

import java.util.LinkedList;
import java.util.List;

public class ChambermaidServiceImpl implements ChambermaidService {

    public List<Room> roomCleaningList(List<Room> roomList ){
        List<Room> onChangeList = new LinkedList<>();
        for (Room room : roomList) {
            if(room.getStatus()== RoomStatus.ONCHANGE){
                onChangeList.add(room);
            }
        }
        return onChangeList;
    }

    public void cleanRooms (List <Room> onChangeList){
        for(Room room: onChangeList){
            room.setStatus(RoomStatus.VACANT);
        }
    }
}
