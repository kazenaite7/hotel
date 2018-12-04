package lt.agota.hotel.ui;

import lt.agota.hotel.domain.Customer;
import lt.agota.hotel.domain.Room;
import lt.agota.hotel.domain.RoomStatus;
import lt.agota.hotel.service.BookingService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerUI {

    public List<Customer> clientListCreator ( List<Room> roomList){
        List<Customer> customerList = new LinkedList<>();

        System.out.println("Add new customer - 1, no new customer - 0");
        Scanner scanner1 = new Scanner(System.in);
        int c;
        c=scanner1.nextInt();

        while (c!=0){
            System.out.println("Insert customer number: ");
            int n = scanner1.nextInt();
            System.out.println("How many guests: ");
            int g = scanner1.nextInt();

            System.out.println("Choose room:");
            int index=0;
            for (Room room : roomList) {
                if(g==room.getGuests()&& room.getStatus()== RoomStatus.VACANT){
                    System.out.println(room);
                    index=1;
                }
            }
            if(index==1){
                System.out.println("Room number:");
                int r = scanner1.nextInt();
                customerList.add(new Customer(n, g, r));
                Customer tempo = customerList.get(customerList.size()-1);
                BookingService.assignRoom(tempo,roomList);
            }
            else if(index==0){
                System.out.println("NO FREE ROOMS!");
            }


            System.out.println("Add new customer - 1, no new customer - 0");
            c=scanner1.nextInt();
            }
    return customerList;
    }


}
