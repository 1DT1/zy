package bofangqi;

public class WMPAdapter implements Player{
    private WindowsMediaPlayer wmp;
    public WMPAdapter(){
        wmp=new WindowsMediaPlayer();
    }
    public void play(String fileName){
        wmp.play(fileName);
    }
}
