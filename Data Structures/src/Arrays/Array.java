package Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // If the array is full, we'll resize it
        if (items.length == count) {
            // Creating a new array (twice the size)
            int [] newItems = new int[count * 2];

            // Copying all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            // Set "items" to this new array
            items = newItems; 
        }

        // adding the new element to the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validating the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        // shift the items to the left to fill the gap
        for (int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }
 
    public int indexOf(int item) {
        for (int i = 0; i < count; i++){
            if (items[i] == item){
                return i;
            }
        }
        return -1;
    }
    
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
