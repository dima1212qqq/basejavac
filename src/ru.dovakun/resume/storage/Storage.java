package ru.dovakun.resume.storage;

import ru.dovakun.resume.model.Resume;

public interface Storage {
    void clear();
    void delete(String s);
    void save(Resume r);
    Resume get(String s);
    void update(Resume r);
    Resume[] getAll();
    int size();
}
