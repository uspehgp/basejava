/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private int size = 0;
    private Resume[] storage = new Resume[10000];


    void clear() {
        for (Resume r : storage) {
            r = null;
            size = 0;
        }
    }

    void update(Resume r) {
        int index = getIndex(r.uuid);
        if (index == -1)
            System.out.println("Resume " + r.uuid + " not exist yet");
        else {
            storage[index] = r;
            System.out.println("The resume has updated");
        }
    }

    void save(Resume r) {
        if (getIndex(r.uuid) >= 0)
            System.out.println("Resume " + r.uuid + " already exist");
        else if (size == storage.length)
            System.out.println("Storage is overflow");
        else {
            storage[size] = r;
            size++;
            System.out.println("The resume " + r.uuid + " has saved");
        }
    }

    Resume get(String uuid) {
        for (Resume r : storage) {
            if (r.uuid.equals(uuid))
                return r;
        }
        return null;
    }

    void delete(String uuid) {
        int index = getIndex(uuid);
        if (index >= 0) {
            storage[index] = null;
            storage[index] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }

    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid))
                return i;
        }
        return -1;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] result = new Resume[size];
        for (int i = 0; i < size; i++) {
            result[i] = storage[i];
        }
        return result;
    }

    int size() {
        return size;
    }
}
