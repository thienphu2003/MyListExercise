import java.util.Arrays;
public class MyList <E>{
    private  int size =0;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] elements;
    public MyList()
    {
        elements=(E[])new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity)
    {
        E[] newData = (E[])new Object[capacity];
        System.arraycopy(elements, 0, newData, 0, size);
        elements = newData;
    }
    public void add(int index ,E element)
    {
        if(size>=elements.length)
        {
            ensureCapacity(size);
        }
        for (int i = size - 1; i >= index; i--)
        {
            elements[i + 1] = elements[i];
        }
        elements[index]=element;
        size++;
    }
    public E remove(int index)
    {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
        E e =(E)elements[index];
        for(int i =index;i< size-1;i++)
        {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return e;
    }
    public int size()
    {
        return this.size;
    }
    public Object clone()
    {
        E[] newArr = (E[])new Object[elements.length];
        for(int i =0; i<size;i++)
        {
            newArr[i]=(E)elements[i];
        }
        return newArr;
    }
    public boolean contains(E o)
    {
        for(int i=0;i<size;i++)
        {
            if(o.equals(elements[i]))
            {
                return true;
            }
        }
        return false;
    }
    public int indexOf( E o)
    {
        for(int i=0;i<size;i++)
        {
            if(o.equals(elements[i]))
            {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e)
    {
        if(size>=elements.length)
        {
            ensureCapacity(size);
            return false;
        }
        elements[size++]=e;
        return true;
    }
    private void ensureCapacity(int minCapacity)
    {
        minCapacity=minCapacity*2;
        elements=Arrays.copyOf(elements,minCapacity);
    }
    public E get(int i)
    {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException
                    ("index " + i + " out of bounds");
        return (E)elements[i];
    }
    public void clear()
    {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

}
