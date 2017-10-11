package Character;

import Fight.WizardFight;
import Move.WizardMove;

public class Wizard extends Character {
    public Wizard(){
        fight = new WizardFight();
        move = new WizardMove();
    }

    public void display(){
        System.out.println("지팡이와 로브");
    }
}
