public class MarioKartPlayer {
    // Data Fields
    private String playerName;
    private String character;
    private Double speed;

    public MarioKartPlayer(String playerName, String character, Double speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public MarioKartPlayer() {
        this.playerName = "Unknown";
        this.character = "Unknown";
        this.speed = 0.0;
    }

    public Double boost() {
        speed += 1;
        return speed;
    }

    public void displayplayerName() {
        System.out.println("Player name: " + playerName);
    }

    public void displayCharacter() {
        System.out.println("Character: " + character);
    }

    public Double displaySpeed() {
        System.out.println("Speed: " + speed);
        return speed;
    }

    public static void main(String[] args) {
        MarioKartPlayer Mario = new MarioKartPlayer("Player 1", "Mario", 3.75);
        MarioKartPlayer Peach = new MarioKartPlayer("Player 2", "Peach", 3.5);

        Mario.displayplayerName();
        Mario.displayCharacter();
        Mario.displaySpeed();
        Mario.boost();
        System.out.println("Player 1 received a boost, new speed: " + Mario.speed);

        Peach.displayplayerName();
        Peach.displayCharacter();
        Peach.displaySpeed();
        Peach.boost();
        System.out.println("Player 2 received a boost, new speed: " + Peach.speed);

    }
}
