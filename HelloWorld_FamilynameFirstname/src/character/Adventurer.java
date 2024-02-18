package character;

public class Adventurer extends Character {
    
    public Adventurer(String name) {
        super(name, (int)(Math.random() * 1000), (int)(Math.random() * 1000), (int)(Math.random() * 500), (int)(Math.random() * 1000), (int)(Math.random() * 100));
    }
}
