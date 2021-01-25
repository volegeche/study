package ioc.inject.demo;

import org.springframework.stereotype.Service;

@Service
public class InjectService {

    private String name = "@Service";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+" InjectService{" +
                "name='" + name + '\'' +
                '}';
    }
}
