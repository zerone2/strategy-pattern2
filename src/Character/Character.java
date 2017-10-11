package Character;

import Fight.*;
import Move.*;

public abstract class Character {

    protected  Fight fight;
    protected  Move move;

    public Character(){}

    public void goFight(){
        fight.fight();
    }

    public void goMove(){
        move.move();
    }

    public abstract void display();
    public void talk() { System.out.println("talk to NPC"); }//NPC한테 말을 건다

    public Fight getFight() { return fight; }
    public void setFight(Fight fight) { this.fight = fight;}

    public Move getMove() { return move; }
    public void setMove(Move move) { this.move = move; }
}
