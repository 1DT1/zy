package Wenjianzhuanhuan;

public class txtWenjian implements wenjian {
    public ShujuFactory wenjianshuju() {
        ShujuFactory shuju = new txt();
        System.out.println("txt数据转换完成");
        return shuju;

    }
}
