package list;

public class DoubleList extends FiniteList {

    public DoubleList() {
        super();
    }

    @Override
    public void add(Object obj) {
        int index = 0;
        if(hasSpace()) {
            if((index = findNull()) != -1) {
                list[index] = obj;
            }
        } else {
            maxLength = list.length * 2;
            increaseSize(maxLength);
            add(obj);
        }
    }

    protected void increaseSize(int size) {
        Object[] auxList = new Object[size];
        for(int i = 0; i < list.length; i++) {
            auxList[i] = list[i];
        }
        list = auxList;
    }
}
