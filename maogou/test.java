package maogou;

public class test{
    public static void main(String[] args){
               Cat fakercat=new Adapter(new ConcreteDog());
                fakercat.catLooks();
                fakercat.catchMouse();
                Dog fakerdog=new Adapter(new ConcreteCat());
                fakerdog.dogLooks();
                fakerdog.cry();
            }

        }

