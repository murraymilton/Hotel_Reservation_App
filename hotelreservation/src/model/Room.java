package model;

public class Room implements IRoom{
    private String roomNumber;
    private double price;

    @Override
    public String toString(){
        return "Room Type:" + "Room Number:" +
                roomNumber + "\n Price:" + price;
    }
}
