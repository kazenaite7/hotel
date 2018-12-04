package lt.agota.hotel.ui;

import lt.agota.hotel.domain.Chambermaid;
import lt.agota.hotel.domain.Customer;
import lt.agota.hotel.service.ChambermaidService;
import lt.agota.hotel.service.ChambermaidServiceImpl;
import lt.agota.hotel.domain.Room;
import lt.agota.hotel.service.RoomService;
import lt.agota.hotel.service.RoomServiceImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class GUI {
    public JButton button1;
    public JPanel panelMain;

    public GUI(List<Room> roomListGUI) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ChambermaidService chambermaidService = new ChambermaidServiceImpl();
                List<Room> roomCleaningList = chambermaidService.roomCleaningList(roomListGUI);

                JOptionPane.showMessageDialog(null, roomCleaningList );
//                for (Room room : roomCleaningList) {
//                    JOptionPane.showMessageDialog(null, room );
//                }
            }
        });
    }
}
