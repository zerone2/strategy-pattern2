import Character.*;

public class MakeCharacter {
    public static void main(String[] args){

        GameCharacter angel = new Angel();
        GameCharacter assassin = new Assassin();
        GameCharacter warrior = new Warrior();
        GameCharacter wizard = new Wizard();

        make(angel);
        make(assassin);
        make(warrior);
        make(wizard);
    }

    public static void make(GameCharacter gameCharacter){
        System.out.println("=============================");
        gameCharacter.display();
        gameCharacter.talk();
        gameCharacter.goMove();
        gameCharacter.goFight();
    }
}
