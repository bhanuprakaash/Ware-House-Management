public interface Shelf {

    void addNewDevice(Object obj);
    void removeDevice(int index);
    Device getFromIndex(int index);
    int getSize();

}
