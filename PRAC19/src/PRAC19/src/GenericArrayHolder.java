package PRAC19.src;


class GenericArrayHolder<T> {
    private T[] array;

    GenericArrayHolder(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }
}
