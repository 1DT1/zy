package Chap19_6;

import java.util.List;

public abstract class AbstractAggregateData {
    private List<String> lstData ;

    public AbstractAggregateData(List<String> lstData){
        this.lstData = lstData;
    }

    protected void addData(String data){
        this.lstData.add(data);
    }

    protected void removeData(String data){
        this.lstData.remove(data);
    }

    protected List<String> getData(){
        return lstData;
    }
    //声明迭代器
    protected abstract AbstractIterator createIterator();

}
