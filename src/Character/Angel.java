package Character;

import Fight.NoFight;
import Move.FlyMove;

public class Angel extends GameCharacter {
    public Angel(){
        fight = new NoFight();
        move = new FlyMove();
    }

    public void display(){
        System.out.println("-천사-\n새하얀 날개");
    }
}
