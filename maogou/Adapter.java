package maogou;
public class Adapter implements Cat, Dog {
    private  Cat cat;
    private  Dog dog;
    public Adapter(Cat cat){
        this.cat=cat;
    }
    public Adapter(Dog dog){
        this.dog=dog;
    }
    @Override
    public void dogLooks() {
        System.out.println("我是一只狗");
    }
    @Override
    public void cry() {
        cat.catchMouse();
    }
    @Override
    public void catLooks() {
        System.out.println("我是一只猫");
    }
    @Override
    public void catchMouse() {
        dog.cry();
    }

}
