package Wenjianzhuanhuan;

public class excelWenjian implements wenjian {
    public ShujuFactory wenjianshuju() {
        ShujuFactory shuju = new excel();
        System.out.println("excel数据转换完成");
        return shuju;

    }
}