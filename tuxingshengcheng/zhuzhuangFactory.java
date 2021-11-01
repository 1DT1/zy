package tuxingshengcheng;

public class zhuzhuangFactory implements tuxingFactory{
    public tuxing cj() {
        tuxing Tuxing = new zhuzhuang();
        return Tuxing;
    }
}
