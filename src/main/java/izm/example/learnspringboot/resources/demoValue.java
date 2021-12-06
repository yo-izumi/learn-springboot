package izm.example.learnspringboot.resources;

import java.io.Serializable;

public class demoValue implements Serializable{
    public demoValue(String value) {
        this.value = value;
    }

    public String value;
}
