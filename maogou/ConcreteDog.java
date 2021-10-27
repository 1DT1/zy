package maogou;

public class ConcreteDog implements Dog{
    @Override
    public void dogLooks() {
        System.out.println("我有狗的外表");

    }
    @Override
    public void cry(){
        System.out.println("汪汪汪");
    }

}