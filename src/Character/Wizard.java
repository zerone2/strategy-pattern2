package Character;

import Fight.MagicFight;
import Move.FlyMove;

public class Wizard extends GameCharacter {
    public Wizard(){
        fight = new MagicFight();
        move = new FlyMove();
    }

    public void display(){
        System.out.println("-마법사-\n지팡이와 로브");
    }
}
