package castle;

import java.util.HashMap;
//import java.util.HashSet;

public class CastleRooms {
	//  ����һ��HashMap������Ǳ��ġ��������������䡱�ĵķֲ����ݣ�
	//  ����һ������ͨ����������ȡ�÷���
	private HashMap<String, Room> rooms = new HashMap<String,Room>();
	private Room outside, lobby, pub, study, bedroom,underroom;
	public CastleRooms() {
       //	����������
       outside = new Room("�Ǳ���");
       lobby = new Room("����");
       pub = new Room("С�ư�");
       study = new Room("�鷿");
       bedroom = new Room("����");
       underroom = new Room("������"); 
       //	��ʼ������ĳ���
       outside.setExit("east", lobby);
       outside.setExit("west", pub);
       outside.setExit("south", study);
       lobby.setExit("west", outside);
       lobby.setExit("down", underroom);
       underroom.setExit("up", lobby);
       pub.setExit("east", outside);
       study.setExit("north", outside);
       study.setExit("east", bedroom);
       bedroom.setExit("west", study);
      //���������HashMap
      rooms.put("outside",outside);
      rooms.put("lobby",lobby);
      rooms.put("pub",pub);
      rooms.put("study",study);
      rooms.put("bedroom",bedroom);
      rooms.put("underroom",underroom);
   }
   public Room Location(String roomName) {
	    return rooms.get(roomName);
   }
}
