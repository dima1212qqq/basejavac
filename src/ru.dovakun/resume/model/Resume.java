package ru.dovakun.resume.model;
import lombok.Getter;
import lombok.Setter;

/**
 * Initial resume class
 */
@Getter @Setter
public class Resume {

    // Unique identifier
    private String uuid;

    @Override
    public String toString() {
        return uuid;
    }
}
