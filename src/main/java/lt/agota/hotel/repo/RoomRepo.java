package lt.agota.hotel.repo;

import lt.agota.hotel.domain.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RoomRepo {

    public List<Room> findAll(){
        List<Room> roomList =new LinkedList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("ROOMS.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int data[] = new int[100];
        int i=0;

        while(scanner.hasNextInt()){        //
            data[i]=scanner.nextInt();
            i++;
//            int n = scanner.nextInt();
//            int g = scanner.nextInt();
//            roomList.add(new Room (n, g));
        }
       if(i%2==0){
            for(int j=0; j<i; j++){
                int n = data[j];
                j++;
                int g = data[j];
                roomList.add(new Room (n, g));
            }
        }
        else {
            System.out.println("BAD DATA FILE!!! ");
            return null;
        }
        return roomList;
    }
}
