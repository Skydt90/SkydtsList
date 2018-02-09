import java.util.Arrays;

public class SkydtsList<E>
{
    private E[] list;
    private int maxCapacity = 2;
    private int size = 0;

    public SkydtsList()
    {
        this.list = (E[]) new Object[2];
        this.size = 0;
    }

    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    public void add(E item)
    {
        if (this.size == maxCapacity)
        {
            maxCapacity = this.list.length * 2;
            list = Arrays.copyOf(list, maxCapacity);
            list[size] = item;
            size++;
        }
        else if (this.size < maxCapacity)
        {
            list[size] = item;
            size++;
        }
    }

    public E get(int index)
    {
        if (index > size)
        {
            return null;
        }
        return list[index];
    }

    public int indexOf(E item)
    {
        for (int i = 0; i < size ; i++)
        {
            if (list[i].equals(item))
            {
                return i;
            }
        }
        return -1;
    }

    public void set(int index, E value)
    {
        if (index > size)
        {
            throw new IndexOutOfBoundsException("Index larger than list!");
        }
        list[index] = value;
    }

    public int size()
    {
        return this.size;
    }

    public String toString()
    {
        if (size == 0)
        {
            return "[]";
        }
        else
        {
            String result = "[" + list[0];
            for (int j = 1; j < size; j++)
            {
                result += ", " + list[j];
            }
            result += "]";
            return result;
        }
    }

}
