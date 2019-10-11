public class ArrayStack<S> implements Stack {
    private Object data[];
    private int top;
    private int size;

    public ArrayStack(){
        data = new Object[10];
        top = 0;
        size = 10;
    }

    @Override
    public void push(Object item) {
        //Push element to top of stack
        if (top == size){
            Object newData[];
            newData = new Object[size * 2];
            for (int i=0; i<size; i++)
                newData[i] = data[i];
            data=newData;
            size=size*2;

        }
        data[top] = item;
        top++;

    }

    @Override
    public Object pop() {
        //remove and return element from top of stack
        Object popped = data[top-1];
        data[top-1] = null;
        if (top > 0) {
            top--;
            return popped;
        } else {
            return null;
        }
    }

    @Override
    public Object peek() {
        //returns top element of stack
        if (top < 0) {
            return null;
        }
        else {
            return data[top];
        }
    }

    @Override
    public boolean empty() {
        //return true of stack is empty
        if (top == 0){
            return true;
        } else {
            return false;
        }
    }
}
