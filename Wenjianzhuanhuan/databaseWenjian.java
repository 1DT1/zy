package Wenjianzhuanhuan;

public class databaseWenjian implements wenjian {

        public ShujuFactory wenjianshuju() {
                ShujuFactory shuju = new databaseShuju();
                System.out.println("database数据转换完成");
                return shuju;
        }
}
