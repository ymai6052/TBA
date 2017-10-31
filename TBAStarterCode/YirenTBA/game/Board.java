package game;

public class Board {


    private Room[][] dungMap;



    public Board(Room[][] dungMap)
    {
        this.dungMap = dungMap;
    }

    public void printMap()
    {
        for(Room[] row : dungMap)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public Room[][] getDungMap() {
        return dungMap;
    }

    public void setSchoolMap(Room[][] schoolMap) {
        this.dungMap = schoolMap;
    }


}
