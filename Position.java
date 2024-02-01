public class Position{
    private int CP,RP;
    int S;
    public Position(int a,int b){
        RP=b;
        CP=a;
    }
    public Position(int a,int b,int c){
        RP=b;
        CP=a;
        S=c;
    }
    int Getrow(){
        return RP;
    }
    int Getcol(){
        return CP;
    }
    int Getsteps(){return S;}

}
