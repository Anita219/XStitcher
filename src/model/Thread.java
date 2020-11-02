package model;

public class Thread {

    /**
     * A class for threads from different companies.
     */

    private String company;
    private String name;
    private String code;

    public Thread(String company, String code) {
        this.company = company;
        this.code = code;
    }

    public Thread(String company, String code, String name){
        this.company = company;
        this.code = code;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
