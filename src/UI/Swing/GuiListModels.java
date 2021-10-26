package UI.Swing;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

//List des Frames(JList) a besoin un Model pour utiliser cette liste(add()-remove()-clear()...) 
//Pour cela on implemente cette classe 
public class GuiListModels<E> extends AbstractListModel<E> {

    private final List<E> list = new ArrayList();

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public E getElementAt(int index) {
        return list.get(index);
    }

    public void add(E a) {
        list.add(a);
        fireIntervalAdded(this, list.size() - 1, list.size() - 1);
    }

    public boolean contains(E a) {
        return list.contains(a);
    }

    public void set(List<E> ls) {
        list.clear();
        list.addAll(ls);
        fireContentsChanged(this, 0, list.size() - 1);
    }

    public List<E> getAll() {
        List<E> ls = new ArrayList();
        ls.addAll(list);
        return ls;
    }

    public void removeAll() {
        int size = list.size();
        list.clear();
        fireContentsChanged(this, 0, size - 1);
    }

    public void remove(E a) {
        int index = list.indexOf(a);
        list.remove(index);
        fireContentsChanged(this, index, index);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
