public class ConcretePlayer implements Player{
    int ID;
    int NumW;
    boolean LastW=false;
    public ConcretePlayer(int x){
        ID = x;

    }
   @Override
    public void won(){
        this.NumW++;
    }
    @Override
    public void setlastwin(){
        this.LastW=true;
    }
    @Override
    public boolean islastwin(){
        return LastW;
    }
    @Override
    public boolean isPlayerOne() {
        if(ID==1){
            return true;
        }
        return false;
    }

    @Override
    public int getWins() {
        return NumW;
    }
}
