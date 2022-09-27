package Chap19_6;

import java.util.List;
public class PageIterator extends AbstractIterator{
    private PageAggregateData pageDataList;
    private List<String> dataList;
    private int pageCount;
    private int cursor;
    public PageIterator(PageAggregateData pageDataList){
        this.pageDataList = pageDataList;
        this.dataList = pageDataList.getData();
        pageCount = dataList.size()%10>0?dataList.size()/10+1:dataList.size()/10;
        cursor = -1;
    }
    @Override
    protected void previousPage() {
        if(cursor >0)
            cursor--;
        else
            cursor=0;
        printData();
    }
    @Override
    protected void nextPage() {
        if(cursor <pageCount-1)
            cursor++;
        printData();
    }
    @Override
    protected void currentPage() {
        printData();
    }
    @Override
    protected void firstPage() {
        cursor = 0;
        printData();
    }
    @Override
    protected void lastPage() {
        cursor=pageCount-1;
        printData();
    }
    @Override
    protected boolean hasNextPage() {
        return cursor!=(pageCount-1);
    }
    private void printData(){
        int start = cursor*10;
        int end = (cursor+1)*10;
        end = end>dataList.size()?dataList.size():end;
        System.out.println("当前第"+(cursor+1)+"页数据start=======");
        for(int i=start;i<end;i++){
            System.out.println(dataList.get(i));
        }
        System.out.println("当前第"+(cursor+1)+"页数据end=======");
    }
}
