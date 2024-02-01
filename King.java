import java.util.ArrayList;

public class King extends ConcretePiece {
    Player OW;
    int N;
    int MK;
    Position P;
    ArrayList<Position> Moveh = new ArrayList<>();

    public King(Position pos, Player owner) {
        P = pos;
        OW = owner;
        Moveh.add(pos);
    }

    @Override
    public Player getOwner() {
        return this.OW;
    }

    @Override
    public String getType() {
        return "♔";
    }

    public void Moved(Position a) {
        Moveh.add(a);
    }

    public void Setpos(Position a) {
        this.P = a;
    }

    public Position Getpos() {
        return P;
    }

    public void setMovekilled(int a) {
        this.MK = a;
    }

    public void setNumber(int n) {
        this.N = n;
    }
}