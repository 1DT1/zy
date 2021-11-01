package Wenjianzhuanhuan;

public class text {
    public static void main(String[] args) {
        wenjian Ctxt = new txtWenjian();
         Ctxt.wenjianshuju();

        wenjian Cdatabase = new databaseWenjian();
         Cdatabase.wenjianshuju();
         wenjian Cexcle =new excelWenjian();
         Cexcle.wenjianshuju();
    }

 }

