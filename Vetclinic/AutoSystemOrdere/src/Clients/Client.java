package Clients;

import java.util.Date;

public class Client {
    private int id;
    private String address;
    private String FIO;
    private String phoneNumber;
    private String email;
    private int personalDiscount;
    static int lastId = 0;

    public Client() { }

    public Client(String address, String FIO, String phoneNumber,
                  String email, int personalDiscount) {
        this.id = lastId + 1;
        lastId = lastId + 1;
        this.address = address;
        this.FIO = FIO;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.personalDiscount = personalDiscount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(int personalDiscount) {
        this.personalDiscount = personalDiscount;
    }


    @Override
    public String toString(){
        return (id + " " + address + " " + FIO + " " + phoneNumber + " " +
                email + " " + personalDiscount);
    }
}
