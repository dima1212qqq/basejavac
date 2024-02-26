package ru.dovakun.resume.storage;

import ru.dovakun.resume.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {


    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    public void save(Resume r) {
        if (size == 0) {
            storage[size++] = r;
        } else if (size > 0) {
            int i = getIndex(r);
            if (i == -1) {
                storage[size++] = r;
                return;
            }
            if (r.equals(storage[i])) {
                System.out.println("Такое резюме есть уже " + storage[i].getUuid());
                return;
            } else if (size >= STORAGE_LIMIT) {
                System.out.println("массив переполнен");
                return;
            }

        }

    }

    @Override
    public void update(Resume r) {
        int i = getIndex(r);
        if (r.equals(storage[i])) {
            storage[i] = r;
        } else {
            System.out.println("такого элемента нет");
        }

    }

    @Override
    public Resume get(String uuid) {
        if 
    }

    @Override
    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = storage[size - 1];
                size--;
                storage[size] = null;
                return;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    @Override
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }
    private int getIndex(Resume r) {
        for (int i = 0; i < size; i++) {
            if (r.equals(storage[i])) {
                return i;
            }
        }
        return -1;
    }
}
