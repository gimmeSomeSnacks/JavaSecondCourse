package ru.tuganov;
import org.springframework.stereotype.Component;

@Component
public class Middle implements Programmer {
    @Override
    public String doCoding() {
        return "Programming smth interesting";
    }
}
