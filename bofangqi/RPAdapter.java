package bofangqi;

public class RPAdapter implements Player{
    private RealPlayer rp;
    public RPAdapter(){
        rp=new RealPlayer();
    }
    public void play(String fileName){
        rp.play(fileName);
    }

}
