import java.util.ArrayList;

public class PancakeIterator implements Iterator {
    ArrayList items;
    int position;

    public PancakeIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) items.get(position);
        position++;
        return menuItem;
    }
}
