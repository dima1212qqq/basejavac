package ru.dovakun.resume.storage;

import lombok.Getter;
import lombok.Setter;
import ru.dovakun.resume.model.Resume;

@Getter
@Setter
public abstract class AbstractArrayStorage implements Storage {
    protected static final int STORAGE_LIMIT = 10000;
    protected int size = 0;
    Resume[] storage = new Resume[STORAGE_LIMIT];

    @Override
    public int size() {
        return size;
    }
}
