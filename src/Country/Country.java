package src.Country;

public class Country {
    String name;
    String language;
    Currency currency;

    public void setName(String val) {
        this.name = val;
    }
    public void setLanguage(String val) {
        this.language = val;
    }
    public void setCurrency(Currency val) {
        this.currency = val;
    }
    public String name() {
        return this.name;
    }
    public String language() {
        return this.language;
    }
    public Currency currency() {
        return this.currency;
    }
}