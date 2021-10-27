package bofangqi;

public class text {
    public static void main(String[] args){
        Player p;
        p=(Player)XMLUtil.getBean();
        p.play("123");
    }
}
