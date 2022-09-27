package Chap19_6;

public abstract class AbstractIterator {
    protected abstract void previousPage();
    protected abstract void nextPage();
    protected abstract void currentPage();
    protected abstract void firstPage();
    protected abstract void lastPage();
    protected abstract boolean hasNextPage();
}
