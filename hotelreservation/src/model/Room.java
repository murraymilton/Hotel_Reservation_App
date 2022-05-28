package model;

public class Room implements IRoom{
    private String roomNumber;
    private double price;
    private enum RoomType;

    @Override
    public String toString(){
        return "Room Type:" + RoomType + "Room Number:" +
                roomNumber + "\n Price:" + price;
    }
}
