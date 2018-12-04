package lt.agota.hotel.domain;

import lt.agota.hotel.domain.Room;


public class Customer {

    private int number;
    private int guests;
    private int roomNumber;
    private Room room;



   public Customer(int number, int guests, int roomNumber){
       this.number =number;
       this.guests = guests;
       this.roomNumber = roomNumber;
   }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Room getRoom() {
        return room;
    }

    public int getGuests() {
        return guests;
    }

    public String toString() {
        return "Customer No." + number +
                ", guests number " + guests +
                " assigned room number " + room.getNumber();
    }
}
