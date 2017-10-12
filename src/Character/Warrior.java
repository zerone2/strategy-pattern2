package Character;

import Fight.SwordFight;
import Move.DashMove;

public class Warrior extends GameCharacter {
    public Warrior(){
        fight = new SwordFight();
        move = new DashMove();
    }

    public void display(){
        System.out.println("-전사-\n방패와 대검");
    }
}
