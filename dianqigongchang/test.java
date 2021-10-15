package dianqigongchang;

import com.sun.javaws.jnl.XMLUtils;

public class test {
    public static void main(String[] args) {
        try {
            dianqiFactory factory;
            Tv tv;
            Kt kt;
            factory = (dianqiFactory) XMLUtil.getBean();
            tv = factory.produceTv();
            tv.produce();
            kt = factory.produceKt();
            kt.produce();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
