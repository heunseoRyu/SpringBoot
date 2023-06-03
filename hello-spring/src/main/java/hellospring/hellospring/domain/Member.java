package hellospring.hellospring.domain;

import io.micrometer.observation.transport.Propagator;

public class Member {
    private long id;
    private String name;
    //Command + N -> getter and setter -> 다 선택
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
