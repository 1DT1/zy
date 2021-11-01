package tuxingshengcheng;

public class quxianFactory implements tuxingFactory{
    public tuxing cj() {
        tuxing Tuxing = new quxian();
        return Tuxing;
    }
}
