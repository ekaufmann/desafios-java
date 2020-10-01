package list;

public class HalfList extends DoubleList{

    public HalfList() {
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
            increaseSize((list.length * 3) / 2);
            add(obj);
        }
    }
}
