package game;

public class GamePlayer {
    private char playerSign; //  символ игрока
    private boolean realPlayer = true;

    public GamePlayer(boolean isRealPlayer, char playerSign) {
        this.playerSign = playerSign;
        this.realPlayer = isRealPlayer;
    }

    public boolean isRealPlayer() {
        return realPlayer;
    }

    public char getPlayerSign() {
        return playerSign;
    }
}
