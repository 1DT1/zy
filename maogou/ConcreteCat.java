package maogou;

public class ConcreteCat implements Cat{
    @Override
    public void catLooks() {
        System.out.println("我有猫的外表");

    }
    @Override
    public void catchMouse(){
        System.out.println("我会抓老鼠");
    }

}
