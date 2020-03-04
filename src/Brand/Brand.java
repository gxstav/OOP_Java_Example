package src.Brand;

import src.Provider.Provider;

public class Brand {
    String name;
    Provider provider;
    public void setName(String val) {  
        this.name = val;
    }
    public void setProvider(Provider val) {  
        this.provider = val;
    }
    public String name() {
        return this.name;
    }
    public Provider provider() {
        return this.provider;
    }
}