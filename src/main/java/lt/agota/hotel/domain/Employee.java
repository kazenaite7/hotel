package lt.agota.hotel.domain;

abstract class Employee {

    private String name;
    private String surname;
    private int id;


    public Employee(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
