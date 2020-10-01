package list;

public class FiniteList {

    protected static final byte MAX_LENGTH = 25;
    private Object[] list;

    public FiniteList() {
        this.list = new Object[MAX_LENGTH];
    }

    public boolean add(Object obj) {
        int index = 0;
        if(hasSpace()) {
            if((index = findNull()) != -1) {
                list[index] = obj;
                return true;
            }
        }
        return false;
    }

    public void remove(Object obj) {
        int index = (int) find(obj);
        if(index != -1) {
            list[index] = null;
        }
    }

    private Object find(Object obj) {
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

    private int findNull() {
        return (int) find(null);
    }

    public boolean contains(Object obj) {
        int index = (int) find(obj);
        if(index != -1) {
            return true;
        }
        return false;
    }

    private boolean hasSpace() {
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
