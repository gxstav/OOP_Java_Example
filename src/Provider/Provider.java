package src.Provider;

import src.Country.*;

public class Provider {
    String name;
    Country country;
    public void setName(String val) {  
        this.name = val;
    }
    public void setCountry(Country val) {  
        this.country = val;
    }
    public String name() {
        return this.name;
    }
    public Country country() {
        return this.country;
    }
}