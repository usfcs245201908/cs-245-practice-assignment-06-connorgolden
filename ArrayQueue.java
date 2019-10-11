public class ArrayQueue<S> implements Queue {
    int size;
    Object data[];
    int head;
    int tail;

    public ArrayQueue(){
        data = new Object[10];
        head = 0;
        tail = 0;
        size = 10;
    }

    @Override
    public Object dequeue() {
        Object ret;
        if (head == tail){
            return null;
        }
        ret = data[head];
        head++;
        return ret;
    }

    @Override
    public void enqueue(Object item) {
        if (tail == size) {
                Object newData[];
                newData = new Object[size * 2];
                for (int i=0; i<size; i++)
                    newData[i] = data[i];
                data=newData;
                size=size*2;
        }
        data[tail] = item;
        tail++;
    }

    @Override
    public boolean empty() {
        return head == tail;
    }
}
