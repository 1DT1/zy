package Chap19_6;
import java.util.List;
public
class PageAggregateData extends AbstractAggregateData {
    public PageAggregateData(List<String> lstData) {
        super(lstData);
    }
    @Override
    protected AbstractIterator createIterator() {
        return new PageIterator(this);
    }
}