package list;

public class FiniteList {

    protected int maxLength = 25;
    protected Object[] list;

    public FiniteList() {
        this.list = new Object[maxLength];
    }

    public void add(Object obj) {
        int index = 0;
        if(hasSpace()) {
            if((index = findNull()) != -1) {
                list[index] = obj;
            }
        }
    }

    public void remove(Object obj) {
        int index = (int) find(obj);
        if(index != -1) {
            list[index] = null;
        }
    }

    protected Object find(Object obj) {
        for (int i = 0; i < list.length; i++) {
            if(obj == null) {
                if (list[i] == obj) {
                    return i;
                }
            } else {
                if (list[i].equals(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    protected int findNull() {
        return (int) find(null);
    }

    public boolean contains(Object obj) {
        int index = (int) find(obj);
        if(index != -1) {
            return true;
        }
        return false;
    }

    protected boolean hasSpace() {
        return findNull() != -1;
    }

    public int size() {
        return list.length;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for(Object obj : list) {
            if(obj != null) {
                output.append(obj);
                output.append(" ");
            }
        }
        return output.toString();
    }
}
