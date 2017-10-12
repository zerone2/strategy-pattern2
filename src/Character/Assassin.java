package Character;

import Fight.SwordFight;
import Move.RapidMove;

public class Assassin extends GameCharacter {
    public Assassin(){
        fight = new SwordFight();
        move = new RapidMove();
    }

    public void display(){
        System.out.println("-암살자-\n두건과 단검");
    }
}
