package dianqigongchang;

public class TCL implements dianqiFactory{
    @Override
    public Tv produceTv(){
        return new TCLTv();
    }
    @Override
    public Kt produceKt(){
        return new TCLKt();
    }
}
