package lt.agota.hotel;

import lt.agota.hotel.domain.Customer;
import lt.agota.hotel.domain.RoomStatus;
import lt.agota.hotel.service.RoomService;
import lt.agota.hotel.service.RoomServiceImpl;
import lt.agota.hotel.ui.CustomerUI;
import lt.agota.hotel.domain.Room;
import lt.agota.hotel.ui.GUI;


import javax.swing.*;
import java.util.List;

public class Main {

    private CustomerUI customerUI;
    private RoomService roomService;

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();

    }

    public Main(){
        customerUI = new CustomerUI();
        roomService = new RoomServiceImpl();
    }


    public void run() {

        List<Room> roomList = roomService.loadRooms();
        if(roomList==null){
            return ;
        }

        System.out.println("Room info:");
        for (Room room : roomList) {
            System.out.println(room);
        }

        List<Customer> customerList = customerUI.clientListCreator(roomList);

        System.out.println("Customer info:");
        for (Customer client : customerList) {
            System.out.println(client);
        }

        List<Room> roomListGUI = roomService.roomsATM(roomList);


        System.out.println("Room info:");
        for (Room room : roomList) {
            System.out.println(room);
        }

        for (Room room : roomList) {
            if(room.getStatus()== RoomStatus.OCCUPPIED){
                room.setStatus(RoomStatus.ONCHANGE);
            }
        }

        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI(roomListGUI).panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
