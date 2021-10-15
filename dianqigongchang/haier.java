package dianqigongchang;

public class haier implements dianqiFactory{
    @Override
    public Tv produceTv(){
        return new haierTv();
    }
    @Override
    public Kt produceKt(){
        return new haierKt();
    }
}
