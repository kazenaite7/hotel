package lt.agota.hotel.domain;

public class Room {

    private int number;
    private int guests;
    private RoomStatus status;
    public static final int MAX_GUESTS = 5;

    public Room(int number, int guests) {
        if (guests <= MAX_GUESTS) {
            this.guests = guests;
        } else {
            this.guests = MAX_GUESTS;
        }
        this.number = number;
        status = RoomStatus.VACANT;                 // kuriant kamabri jis sukuriamas visada laisvas
    }

    public void setStatus(RoomStatus status) {
        this.status = status;                       // jei keiciasi kambario uzimtumas
    }

    public RoomStatus getStatus() {
        return status;
    }

    public int getGuests() {
        return guests;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "No." + number +
                " ,maximum guests:" + guests +
                " ,room status \'" + status + "\'.\n\r";
    }
}
