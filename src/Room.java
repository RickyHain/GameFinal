public class Room {
    private static final String[] rooms = {"Outside", "Room 1", "Room 2", 
        "Room 3"};
    private String roomName;
    private int roomNumber;

    public Room() {
        roomNumber = 0;
        roomName = rooms[roomNumber];

    }
    public Room(int room) {
        roomNumber = room;
        roomName = rooms[roomNumber];
    }

    public void examine() {
        if (roomNumber == 0) {
            System.out.println("You are outside the dungeon - in front of you is the entrance.\n");
        }
        if (roomNumber == 1) {
            System.out.println("You are in the first room of the dungeon - many bats are hanging from the ceiling, "
            + "and might swoop down at any time. \nAcross the room, there is a door to the next room.\n");
        }
        if (roomNumber == 2) {
            System.out.println("This second room is dark - a door is faintly illuminated on the other side." 
            + " Every corner of the room is shrouded in darkness, however.\n");
        }
        if (roomNumber == 3) {
            System.out.println("You are now in the last room, and the exit can be seen on the other side! "
            + "There's an uneasy feeling in this room, however.\n");
        }
    }

    public String toString() {
        return this.roomName;
    }

}
